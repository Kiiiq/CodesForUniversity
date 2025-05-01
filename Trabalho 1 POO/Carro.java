import java.util.Random;

public class Carro {
    private Random random= new Random();
    private int posicao=0;
    private char carImage;

    public Carro(char t){
        carImage=t;
    }

    public int getPosicao(){
        return posicao;
    }

    public char getCarImage() {
        return carImage;
    }

    public void mostrarCarro(){
        System.out.println("\n");
        for (int i = 0; i < posicao; i++) {
            System.out.print(" ");
        }
        System.out.print(carImage);
    }

    public void novaPosicao(){
        posicao+=random.nextInt(1,4);
    }
}
