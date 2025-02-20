/*
8) A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa em Java que
receba o enquadramento do professor e a quantidade de horas trabalhadas, calcule e exiba o salário do
professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
Enquadramento Valor da hora/aula
Nível 1 R$12,00
Nível 2 R$17,00
Nível 3 R$25,00
*/

import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> levelPrice = new HashMap<Integer, Integer> ();

        levelPrice.put(1, 12);
        levelPrice.put(2, 17);
        levelPrice.put(3, 25);

        Integer horas, level;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite seu nivel de professor:");
        level=scanner.nextInt();

        System.out.println("Digite quantas horas voce trabalhou essa semana:");
        horas=scanner.nextInt();

        scanner.close();

        System.out.println("Seu pagamento será de R$" + horas*levelPrice.get(level));


    }
}