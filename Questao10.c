#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){
    int i=0;
    int j=0;
    int matriculas[20];
    int HorasDeTrabalho[20];
    
    double salariol[20];
    double salariob[20];
    double conpessoal[20];
    double contotal;
    double pagamentototal;

    const double Pagph=35;
    const double inss=0.085;
    const double consin=0.0102;
    const double planosaude=0.06;

    char nomes[20][50];

    double media;
    
    while (1){
        while (1){
            printf("Insira sua matricula:\n");
            scanf("%d", &matriculas[i]);
             if ((matriculas[i]>999 && matriculas[i]<10000) || matriculas[i]==0){
                break;
             }
             
            printf ("matricula invalida\n\n");
        }
        
        if (matriculas[i]==0){
            break;
        }
        
        printf("\n\nInsira seu nome:\n");
        scanf("%s", &nomes[i]);
        
        printf("\n\nHoras trabalhadas nesse mes:\n");
        scanf("%d", &HorasDeTrabalho[i]);

        salariob[i]=HorasDeTrabalho[i]*Pagph;
        printf("O trabalhador %s teve o salario bruto de %.2lf por %d horas trabalhadas\n\n\n\n", nomes[i], salariob[i], HorasDeTrabalho[i]);

        salariol[i]= salariob[i] - (salariob[i]*inss) - (salariob[i]*consin) - (salariob[i]*planosaude);
        printf("Com a reducao dos impostos o salario liquido fica com um total de %.2lf\n\n\n", salariol[i]);
        
        conpessoal[i]= salariob[i]-salariol[i];
        contotal= contotal + conpessoal[i];
        pagamentototal=pagamentototal+salariob[i];
        i++;
    }

        printf("\n\n Relatorio \n\n ");

    for (j = 0; j<i; j++){
        printf("nome: %s    matricula: %d   pagamento: %.2lf   contribuicao: %.2lf \n ",nomes[j], matriculas[j], salariob[j], conpessoal[j]);
    }
    
    printf("\n\n O pagamento total feito foi de %.2lf e as contribuicoes totais foram de %.2lf.", pagamentototal, contotal);

    return 0;

}