/* 
19) Faça um programa que preencha uma matriz quadrada de forma que:
    • os elementos da diagonal principal sejam todos zero
    • os elementos acima da diagonal principal sejam todos iguais a 1
    • os elementos abaixo da diagonal principal sejam todos iguais a -1
*/

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho desejado da matriz");
        tamanho = scanner.nextInt();
        scanner.close();

        int[][] matriz = new int[tamanho][tamanho];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    matriz[i][j]=0;
                    
                } else if (i < j) {
                    matriz[i][j]=1;
                } else {
                    matriz[i][j]=-1;
                }
                System.out.print(String.format("%3s",matriz[i][j]));
            }
            System.out.print("\n");
        }
    }
}
