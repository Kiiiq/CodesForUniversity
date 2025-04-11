public class Pista {

    private int tamanho;

    public Pista(int i){
        tamanho=i;
    }

    public void limparTerminal(){
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

    public int getTamanho(){
        return tamanho;
    }

    public void construirPista(){
        System.out.println("\n");
        for (int i = 0; i < tamanho; i++) {

            System.out.print("-");
        }
    }

}
