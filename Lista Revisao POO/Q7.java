
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        
        int l1=0,l2=0,l3=0;
        
        while (true) {
            l1=Scan(l1);
            l2=Scan(l2);
            l3=Scan(l3);

            if (Check(l1, l2, l3)) {break;}
        }
        

        System.out.println("O triangulo digitado é um triangulo "+ TriangleType(l1, l2, l3));
    }

    public static int Scan(int i){
        Scanner scanner=new Scanner(System.in);
        i=scanner.nextInt();
        return i;
    }

    public static boolean Check(int i, int j, int k){
        if ((i<j+k)&&(j<i+k)&&(k<i+j)) {
            return true;
        } else{
            System.out.println("Triangulo invalido! \nTente novamente.");
            return false;
        }
        
        
    }

    public static String TriangleType(int i, int j, int k){
        int qntdIguais=0;

        if (i==j) {
            qntdIguais++;
        }

        if (j==k) {
            qntdIguais++;
        }

        if (k==i) {
            qntdIguais++;
        }

        if (qntdIguais==0) {
            return "Escaleno";
        } else if (qntdIguais==1) {
            return "Isoceles";
        } else{
            return "Equilatero";
        }
    }
}
