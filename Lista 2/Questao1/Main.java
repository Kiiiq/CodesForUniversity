package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ProgressaoAritimetica objPA = new ProgressaoAritimetica(5,9);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos a ser calculada:");
        n=sc.nextInt();

        System.out.println("\n\n");
        
        for (int i = 0; i < n; i++) {
            
            objPA.gerarPA();
        }
        sc.close();
    }
}
