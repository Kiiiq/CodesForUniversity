import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int macas;
        float preco;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Quantas macas voce deseja?");
        macas=sc.nextInt();
        sc.close();

        if (macas<12) {
            preco=0.30f;
        } else {
            preco=0.25f;
        }

        System.out.println("O preco final ficou por R$ " + String.format("%.2f",macas*preco));
    }
}
