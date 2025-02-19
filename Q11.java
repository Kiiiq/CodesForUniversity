import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, escolha, saldo=0;
        boolean rodando=true;

        while (rodando) {
            System.out.println("\n\nEscolha a operacao desejada:\n1.Depósito \n2.Retirada \n3.Fim");
            escolha=scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nQuanto voce deseja Depositar no saldo:");
                    valor=scanner.nextInt();
                    saldo+=valor;
                    break;
                case 2:
                    System.out.println("\nQuanto voce deseja retirar do saldo:");
                    valor=scanner.nextInt();
                    saldo-=valor;
                    break;
                
                case 3:
                    rodando=false;
                    break;
            
                default:
                    System.out.println("\nOpcao inexistente, tente novamente.\n\n");
                    break;
            }
        }

        scanner.close();

        if (saldo>0) {
            System.out.println("\n\nSaldo Preferencial");
        }else if (saldo<0) {
            System.out.println("\n\nSaldo negativado");
        } else {
            System.out.println("\n\nSaldo Zerado");
        }

    }
}