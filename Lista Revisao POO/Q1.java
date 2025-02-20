/*  
1) Faça um programa em Java que receba uma temperatura em centígrados e transforme para fahrenheit.
Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.
*/

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
