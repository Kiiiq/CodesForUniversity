#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    float valor, parcela;
    int opcao, i;

    printf("Valor do produto\n");
    scanf("%f",&valor);


    while (1){
        printf("\n\n\nForma de Pagamento\n\n 1) A vista (Desconto de 10%%)\n 2) Em 2 vezes(Valor padrao)\n");
        if (valor>=100)
        {
            printf(" 3) Em 3 vezes (Juros de 3%% ao mes)\n\n");
        }
    
        scanf("%d", &opcao);

        switch (opcao)
        {
        case 1:
            
            valor*=0.9;
            printf("\n\nO valor a ser pago eh R$%.2f", valor);
            i++;
            break;
        
        case 2:
            parcela=valor/2;
            printf("\n\nO valor de cada parcela fica R$%.2f totalizando R$%.2f",parcela,valor);
            i++;
            break;

        case 3:

            if (valor>=100){
                parcela=valor/3;
                valor=parcela+(parcela*1.03)+((parcela*1.03)*1.03);
                printf("o valor das parcelas fica, R$%.2f", parcela);
                parcela+=(parcela*0.03);
                printf(", R$%.2f",parcela);
                parcela+=(parcela*0.03);
                printf(", R$%.2f, totalizando o valor de R$%.2f",parcela,valor);
                i++;
                break;

            }else {
                printf("Selecione uma opcao valida");
                break;    
            }

        default:
            printf("Selecione uma opcao valida");
            break;
        }

        if(i==1){
            break;
        }

    }
    return 0;

}