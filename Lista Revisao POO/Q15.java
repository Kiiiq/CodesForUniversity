/* 
15) Faça um programa que receba uma string e mostre-a na vertical.
*/

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        String string;
        Scanner scanner= new Scanner(System.in);
        

        string=scanner.nextLine();
        scanner.close();

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
