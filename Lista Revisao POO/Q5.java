import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner= new Scanner(System.in);
 
        System.out.println("Digite a sua idade para saber em qual categoria de votacao voce se encaixa:");
        
        idade=scanner.nextInt();
        scanner.close();

        if (idade<16) {
            System.out.println("Voce ainda nao pode votar!");
        } else if (idade==16||idade==17 || idade<64) {
            System.out.println("Seu voto e facultativo!");
        } else {
            System.out.println("Seu voto e obrigatorio");
        }
    }
}
