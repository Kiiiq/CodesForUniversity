package Q2;

public class Conta {
    private double saldo;
    private String nome;
    private int numConta=0;


    public Conta(String nome, int numConta){
        this.nome=nome;
        this.numConta=numConta;
    }

    public void saque(){
        double quantia;
        System.out.println("Quantia de saque Desejada:");
        quantia=Main.scanner.nextInt();

        if (quantia>saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo-=quantia;
        }
    }

    public void deposito(){
        double quantia;
        System.out.println("Quantia de depos Desejada:");
        quantia=Main.scanner.nextInt();

        saldo+=quantia;
    }

    public double verSaldo(){
        return saldo;
    }
}
