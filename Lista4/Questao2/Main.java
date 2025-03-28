import java.util.Scanner;

import Figuras.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo= new Retangulo();

        construirCirculo(circulo);
        System.out.println("Perimetro do Circulo: "+ circulo.perimetro()+ "          Area do Circulo: "+ circulo.area());
        construirRetangulo(retangulo);
        System.out.println("Perimetro do Retangulo: "+ retangulo.perimetro() + "          Area do Retangulo: "+ retangulo.area());
    }

    public static void construirCirculo(Circulo circulo){
        System.out.println("Digite o Raio do Circulo");
        circulo.setRaio(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a posicao X do centro do Circulo");
        circulo.setX(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a posicao Y do centro do Circulo");
        circulo.setY(scanner.nextDouble());
        scanner.nextLine();
    }

    public static void construirRetangulo(Retangulo retangulo){
        System.out.println("Digite o comprimento do retangulo");
        retangulo.setComprimento(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a largura do retangulo");
        retangulo.setLargura(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a posicao X do canto superior esquerdo do retangulo");
        retangulo.setX(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a posicao Y do canto superior esquerdo do retangulo");
        retangulo.setY(scanner.nextDouble());
        scanner.nextLine();
    }
    
}
