/*
4) Faça um programa em Java que receba as horas de início e fim de uma atividade (expressas em horas,
minutos e segundos) e ao final informe o tempo de duração da atividade. Dica: transforme as horas de início
e fim em segundos, realize a subtração e em seguida volte a transformar em horas, minutos e segundos. 
*/
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String temp="";
        String[] tempParts;
        Scanner sc = new Scanner(System.in);
        int[] hours={0,0}, minutes={0,0}, seconds={0,0};
        int hoursR=0, minutesR=0, secondsR=0;
        int check=0; 

        while(true){
            if(check==0){System.out.println("Digite a hora de inicio da atividade: (hh:mm:ss)");} 
            else {System.out.println("Digite a hora de termino da atividade: (hh:mm:ss)");}

            temp = sc.nextLine();
            tempParts= temp.split(":");
            try{
                
                hours[check]=Integer.parseInt(tempParts[0]);
                minutes[check]=Integer.parseInt(tempParts[1]);
                seconds[check]=Integer.parseInt(tempParts[2]);
                
                if ((hours[0]<24 && hours[0]>=00)&&(minutes[0]<60 && minutes[0]>=00)&&(seconds[0]<60 && seconds[0]>=00)) {
                    if (check==0) {check++;} 
                    else {break;}
                } else {
                    System.out.println("Erro: Horario Invalido.");
                }
            } catch( Exception e){
            System.out.println("Erro: Horario digitado em formato errado.");
            
            }
        }

        sc.close();

        for (int i = 0; i < seconds.length; i++) {
            seconds[i]+=(hours[i]*3600)+(minutes[i]*60);
        }

        if (seconds[0]<seconds[1]) {
            secondsR=seconds[1]-seconds[0];
        } else {
            secondsR=(24*3600)-(seconds[0]-seconds[1]);
        }

        hoursR=secondsR/3600;
        secondsR-=hoursR*3600;

        minutesR=secondsR/60;
        secondsR=minutesR*60;

        System.out.println("Voce passou "+hoursR+" horas, "+minutesR+" minutos e "+secondsR+" segundos fazendo a sua atividade");
    }
}