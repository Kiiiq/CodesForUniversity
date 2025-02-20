/* 
16) Faça um programa que receba o nome e a idade de 20 pessoas e armazene em dois vetores. Uma vez
preenchidos os vetores, o programa deve calcular a média das idades e listar os nomes das pessoas que têm
idade acima da média.
*/

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        int[] idades = new int[20];
        String[] nomes = new String[20];
        Scanner scanner = new Scanner(System.in);

        float media=0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite sua idade:");
            idades[i]=scanner.nextInt();
            media+=idades[i];

            scanner.nextLine();

            System.out.println("Digite seu nome:");
            nomes[i]=scanner.nextLine();

            System.out.println("Usuario cadastrado \n\n");
        }
        
        scanner.close();

        media/=(float)idades.length;

        for (int i = 0; i < nomes.length; i++) {
            if (idades[i]>media) {
                System.out.println(nomes[i]);
            }
        }
    }
}
