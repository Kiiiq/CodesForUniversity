package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ProgressaoAritimetica objPA;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos a ser calculada:");
        n=sc.nextInt();
        sc.nextLine();
        
        objPA = new ProgressaoAritimetica(sc);


        System.out.println("\n\n");
        
        for (int i = 0; i < n; i++) {
            
            System.out.println(objPA.gerarPA());
        }
        sc.close();

        objPA.setRazao(7);
        objPA.setPriTermo(8);
    }
}
