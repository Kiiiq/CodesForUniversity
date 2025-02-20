/* 
20) Faça uma função que preencha uma matriz com uma sequência de números iniciada por 1 coluna
a coluna.

Exemplo:
1 4 7
2 5 8
3 6 9
*/

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int tamanho;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho desejado da matriz");
        tamanho = scanner.nextInt();
        scanner.close();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i]=(matriz.length*i)+j;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(String.format("%5s", matriz[i][j]));
            }
            System.out.print("\n");
        }
    }
}
