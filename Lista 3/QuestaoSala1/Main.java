package QuestaoSala1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        Triangulo triangulo = escolha();

        System.out.println(triangulo.getPerimetro());
        System.out.println("\n\n");
        System.out.println(triangulo.getArea());
    }

    public static double scan(){
        System.out.println("Digite o Valor do Lado:");
        int i=scanner.nextInt();
        return i;
    } 

    public static Triangulo trianguloEscaleno(){
        double lado1,lado2,lado3;

        lado1=scan();
        lado2=scan();
        lado3=scan();

        Triangulo triangulo=new Triangulo(lado1, lado2, lado3);
        return triangulo;
    }

    public static Triangulo trianguloIsoceles(){
        double lado1,lado2;

        lado1=scan();
        System.out.println("O lado abaixo tera 2 lados iguais");
        lado2=scan();
        
        Triangulo triangulo=new Triangulo(lado1, lado2);
        
        return triangulo;
    }

    public static Triangulo trianguloEquilatero(){
        double lado1;

        lado1=scan();
    
        Triangulo triangulo=new Triangulo(lado1);
        return triangulo;
    }

    public static Triangulo escolha(){
        int i;
        
        System.out.println("Qual triangulo voce deseja Criar:\n     0- Escaleno\n     1- Isoceles\n     2-Equilatero");
        i=scanner.nextInt();

        switch (i) {
            case 0:
                return trianguloEscaleno();
                
            case 1:
                return trianguloIsoceles();
            
            case 2:
                return trianguloEquilatero();
            
        
            default:
                System.out.println("Opcao invalida, digite o triangulo manualmente");
                return trianguloEscaleno();
                
        }
        
    }
}