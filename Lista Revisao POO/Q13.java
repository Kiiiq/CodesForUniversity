/* 
13) Faça um programa que receba um número inteiro e informe se é um número primo.
*/

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        int num, qntdDivisores=0;
        Scanner scanner = new Scanner(System.in);

        num=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                qntdDivisores++;
            }

            if (qntdDivisores>2) {
                break;
            }
        }

        if (qntdDivisores>2) {
            System.out.println("O numero nao eh primo");
        } else { 
            System.out.println("O numero eh primo");
        }
    }
}
