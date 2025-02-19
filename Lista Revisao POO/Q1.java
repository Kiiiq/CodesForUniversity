

import java.util.Scanner;

public class Q1 {
    public static void main (String args[]){
        float temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus:\n");

        temp=scanner.nextFloat();
        scanner.close();

        temp=(temp*1.8f)+32;

        System.out.println("\n\n"+temp + "ºF");
    }
}
