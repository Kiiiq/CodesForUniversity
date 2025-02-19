import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        int numero=0, maior=0, quantidade=0,menor=0,qntdpar=0;
        float media=0, mediapar=0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite um numero para entrar na conta (Digite qualquer letra para sair): ");
                numero=scanner.nextInt();
                quantidade++;
            } catch (Exception e) {
                System.out.println("Programa interrompido");
                break;
            }

            media+=numero;
            maior=CheckMaiorNum(numero, maior);
            menor=CheckMenorNum(numero, menor);
            if (numero%2==0) {
                mediapar+=numero;
                qntdpar++;
            }        
        }

        System.out.println("Soma dos Numeros:"+media+
                           "\nQuantidade de Numeros:" + quantidade +
                           "\nMedia:"+media/(float)quantidade +
                           "\nMaior numero digitado:"+ maior +
                           "\nMenor numero digitado:"+ menor +
                           "\nMedia dos Pares:" + mediapar/(float)qntdpar);

        
    }    


    public static int CheckMaiorNum(int numero, int maior){
        if (numero>maior) {
            return numero;
        } else {
            return maior;
        }
    }
    public static int CheckMenorNum(int numero, int menor){
        if (numero<menor) {
            return numero;
        } else {
            return menor;
        }
    }
}