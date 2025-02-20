/*
6) As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem
compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o valor total da compra.
*/

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
