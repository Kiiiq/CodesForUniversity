/* 
11) Escreva um programa para ler o nome do cliente e o saldo inicial de uma conta bancária. A seguir ler um
número indeterminado de pares de valores indicando respectivamente o tipo da operação (codificado da
seguinte forma: 1.Depósito 2.Retirada 3.Fim) e o valor. Quando for informado para o tipo o código 3, o
programa deve ser encerrado e impresso o saldo final da conta com as seguintes mensagens: CONTA ZERADA,
CONTA ESTOURADA(se o saldo for negativo) ou CONTA PREFERENCIAL (se o saldo for positivo).
*/

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