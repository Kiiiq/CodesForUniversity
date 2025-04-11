import java.util.Random;

public class Carro {
    Random random= new Random();
    int posicao=0;
    char carImage;

    public Carro(char t){
        carImage=t;
    }

    public int getPosicao(){
        return posicao;
    }

    public void mostrarCarro(){
        System.out.println("\n");
        for (int i = 0; i < posicao; i++) {
            System.out.print(" ");
        }
        System.out.print(carImage);
    }

    public void novaPosicao(){
        posicao+=random.nextInt(1,4);
    }
}
