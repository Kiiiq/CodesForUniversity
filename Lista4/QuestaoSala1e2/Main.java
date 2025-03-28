import java.util.Scanner;
import Series.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        escreverFibonacci();
        escreverPA();
        escreverPG();

    }

    public static void escreverPA(){
        int qntd;
        ProgressaoAritimetica pa = new ProgressaoAritimetica(scanner);
        System.out.println("Digite quantos termos serao gerados");
        qntd= scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntd; i++) {
            System.out.println(pa.gerarPA());
        }

    }

    public static void escreverFibonacci(){
        int qntd;
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Digite quantos termos serao gerados");
        qntd= scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntd; i++) {
            System.out.println(fibonacci.gerarFibonacci());
        }
    }
    
    public static void escreverPG(){
        int qntd;
        ProgressaoGeometrica pg = new ProgressaoGeometrica(scanner);
        System.out.println("Digite quantos termos serao gerados");
        qntd= scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qntd; i++) {
            System.out.println(pg.gerarPG());
        }
    }

    
}
