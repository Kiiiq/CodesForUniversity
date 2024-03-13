#include <stdio.h>


struct Transacao {
    int numeroProjeto;
    float valor;
    char tipoDespesa; 
};

// Função principal
int main() {
    const int numProjetos = 10;
    float saldos[numProjetos]; 

    struct Transacao transacao;

    
    while (1) {
        
        printf("Digite o número do projeto (-1 para encerrar): ");
        scanf("%d", &transacao.numeroProjeto);

        
        if (transacao.numeroProjeto == -1) {
            break;
        }

        printf("Digite o valor da transação: ");
        scanf("%f", &transacao.valor);

        printf("Digite o tipo de despesa (R para Receita, D para Despesa): ");
        scanf(" %c", &transacao.tipoDespesa);

    
        if (transacao.numeroProjeto < 0 || transacao.numeroProjeto >= numProjetos) {
            printf("Número do projeto inválido. Use um número de 0 a 9.\n");
            continue; 
        }

        // Atualiza o saldo do projeto com base na transação
        if (transacao.tipoDespesa == 'R') {
            saldos[transacao.numeroProjeto] += transacao.valor;
        } else if (transacao.tipoDespesa == 'D') {
            saldos[transacao.numeroProjeto] -= transacao.valor;
        } else {
            printf("Tipo de despesa inválido. Use 'R' para Receita ou 'D' para Despesa.\n");
            continue;
        }
    }


    printf("\nSaldos finais dos projetos:\n");
    for (int i = 0; i < numProjetos; ++i) {
        printf("Projeto %d: %.2f\n", i, saldos[i]);
    }

    return 0;
}