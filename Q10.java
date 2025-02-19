import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int i=1, i2=0, j;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite um numero:");
        j=scanner.nextInt();
        scanner.close();

        while (i<j) {
            i+=i2;
            i2=i-i2;
            System.out.println(i);
        }

        if (i==j) {
            System.out.println("O numero faz parte da sequencia de fibonacci");
        } else{
            System.out.println("O numero nao faz parte da sequencia de fibonacci");
        }
    }
}
