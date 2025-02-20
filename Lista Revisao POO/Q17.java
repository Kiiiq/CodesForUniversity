/* 
17) Faça um programa que preencha um vetor com 50 valores recebidos pelo teclado e, ao final, informe a
posição do maior número. Desconsidere a possibilidade de empate.
*/

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        int[] nums = new int[50];
        int maxIndex=0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Digite um numero");
            nums[i]=scanner.nextInt();
            scanner.nextLine();

            if (nums[i]>nums[maxIndex]) {
                maxIndex=i;
            }
        }

        scanner.close();

        System.out.println("O Index que armazena o maior numero é: " + maxIndex);
    }
}
