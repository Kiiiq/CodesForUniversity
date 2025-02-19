import java.util.Scanner;

public class Q3 {
    public static void main (String args[]){
        String temp;
        String[] tempParts;
        Scanner sc = new Scanner(System.in);
        float divisor=0,soma=0, qntdDeNotas=3,notas=0, pesos=0;


        for(int i=0;i<qntdDeNotas;i++){
            System.out.println("Digite a "+(i+1)+"º nota do aluno e seu peso (separados por \"Espaco\")");
            temp=sc.nextLine();
            tempParts=temp.split(" ");
            
            notas=Integer.parseInt(tempParts[0]);
            pesos=Integer.parseInt(tempParts[1]);

            soma+=notas*pesos;
            divisor+=pesos;
        }
        sc.close();
        System.out.println("A media final do Aluno é:"+(soma/divisor));

    }
}