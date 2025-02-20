/* 
9) Faça um programa que receba um valor n e em seguida informe o valor de S.
    a) s=1+1/2+1/3+...+1/n
    b) s=1/n + 2/(n-1) + 3/(n-2) +...+ (n-1)/2+n
    c) s=1 - 1/2 + 1/3- 1/4 +...+ 1/n
*/

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char formula= ' ';
        float n;
        
        System.out.println("Digite a formula desejada: A ,B ou C:");
        formula=scanner.next().charAt(0);

        System.out.println("Digite o valor de n:");
        n=scanner.nextInt();
        scanner.close();

        switch (formula) {
            case 'a':
                System.out.println("S= "+ FormulaA(n));
                break;

            case 'b':
                System.out.println("S= "+ FormulaB(n));
                break;
        
            case 'c':
            System.out.println("S= "+ FormulaC(n));  
                break;

            default:
                break;
        }
    }

    public static float FormulaA(float n) {
        float S=0;

        for (int i=1;i<=n;i++){
            S+=1/(float)i;
            System.out.println(S);
        }

        return S;
    }


    public static float FormulaB(float n) {
        float S=0;

        for (int i=1;i<n;i++){
            S+=i/n-((float)i-1);
        }

        return S;
    }

    public static float FormulaC(float n) {
        float S=0;

        S=1-1/2;

        for (int i=3;i<=n;i++){
            S+=1/(float)i;
        }

        return S;
    }
}