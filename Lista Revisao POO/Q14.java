/* 
14) Faça um programa que receba um número N e mostre na tela os N primeiros números primos.
*/

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        int qntdDivisores=0, qntdPrimos, primosContados=0,numTemp=2;
        Scanner scanner = new Scanner(System.in);

        qntdPrimos=scanner.nextInt();
        scanner.close();

        while (primosContados<qntdPrimos) {
        
            for (int j = 1; j <= numTemp; j++) {
                if (numTemp % j == 0) {
                    qntdDivisores++;
                }
            }
    
            if (qntdDivisores<=2) {
                System.out.println(numTemp);
                primosContados++;
            }
            
            qntdDivisores=0;
            numTemp++;
        }
    }
}

