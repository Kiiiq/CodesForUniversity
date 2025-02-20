/*
2) Faça um programa em Java que solicite a hora atual (expressa em horas, minutos e segundos) ao usuário e
informe quantos segundos do dia já passaram. 
*/


import java.util.Scanner;

public class Q2 {
    public static void main (String args[]){
        String time;
        String[] timeParts;
        int totalSeconds,hours,minutes,seconds;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o Horario Atual \"hh:mm:ss\":\n");
        while (true) {
            time= scanner.nextLine();
            timeParts= time.split(":");
            try{
                hours=Integer.parseInt(timeParts[0]);
                minutes=Integer.parseInt(timeParts[1]);
                seconds=Integer.parseInt(timeParts[2]);
                if ((hours<24 && hours>=0)&&(minutes<60 && minutes>=0)&&(seconds<60 && seconds>=00)) {
                    break;
                } else {
                    System.out.println("\nPor favor, digite o horario no formato \"hh:mm:ss\":\n");
                }
                
            } catch(Exception e) {
                System.out.println("\naaaaaPor favor, digite o horario no formato \"hh:mm:ss\":\n");
            }
        }
        scanner.close();

        totalSeconds=(hours*3600)+(minutes*60)+seconds;
        System.out.println("\nNo dia de hoje ja se passaram "+ totalSeconds+ " segundos");



    }
}
