import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Carro> carros;
        carros=registrarCarros();
        Pista pista = novaPista();
        

        iniciarCorrida(carros, pista);
        printGanhadores(carros.toArray(new Carro[carros.size()]));
        
    }

    

    public static List<Carro> registrarCarros(){
        List<Carro> carros= new ArrayList<Carro>();
        char carImage;
        int numCarros=1;

        System.out.println("Digite o caracter que voce deseja que represente o carro da linha "+ numCarros + ":");
        carImage = scanner.nextLine().charAt(0);

        while (carImage!=' ') {
            carros.add(new Carro(carImage));
            numCarros++;
            System.out.println("Digite o caracter que voce deseja que represente o carro da linha "+ numCarros + ":");
            try{carImage = scanner.nextLine().charAt(0);} catch(Exception e) { carImage=' ';}
        }
        return carros;
    }

    public static Pista novaPista(){
        int i;
        System.out.println("Qual o tamanho da pista desejada?");
        i=scanner.nextInt();
        scanner.close();
        return new Pista(i);
    }
    
    public static void iniciarCorrida(List<Carro> list, Pista pista){
        boolean fim=false;
        
        primeiraPista(list, pista);

        while (!fim){           
            pista.limparTerminal();
            pista.construirPista();
            for (Carro carro : list) {
                
                if (carro.getPosicao()>=pista.getTamanho()) {
                    fim=true;
                }else{
                    carro.novaPosicao();
                }
                carro.mostrarCarro();
            }
            pista.construirPista();
            System.out.println("\n");
            wait(400);
        }
    }

    public static void primeiraPista(List<Carro> list, Pista pista){
        pista.limparTerminal();
        pista.construirPista();
        for (Carro carro : list) {
            carro.mostrarCarro();
        }
        pista.construirPista();
        //System.out.println("\n");
        wait(200);
    }


    public static void wait(int i){
        try {TimeUnit.MILLISECONDS.sleep(i);} catch(Exception e){}
    }
    
    public static void printGanhadores(Carro[] carros){
        AlgoritimoDeRanqueamento algoritimoDeRanqueamento = new AlgoritimoDeRanqueamento();
        int temp, j=1;

        carros=  algoritimoDeRanqueamento.startQuickSort(carros,0,carros.length-1);
        temp= carros[0].getPosicao();
        
        System.out.println("Os ganhadores da corrida sao:");
        for (int i = 0; i < carros.length; i++) {
            if (temp!=carros[i].getPosicao()) {
                j++;
                temp=carros[i].getPosicao();
                System.out.println("E em "+j+"º lugar ficam:");
            }
            System.out.println("    "+carros[i].getCarImage());
            
        }
    }
}
