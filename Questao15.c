#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

double media(double i, int j, double num[j], double soma, double resultado);

double somaq(double i, int j, double num[j], double somaq);

double prodcubo(double i, int j, double num[j], double prodc);


int main (){
//---------------------------------DECLARACAO DE VARIAVEIS---------------------------------
int i;
int j;
int maior200;

double num[20];
double produto;
double soma;
double nummedia;
double somapmedia;

    while (1){
        printf("\n\ndigite um numero\n");
        scanf("%lf", &num[i]);
        if (num[i]==0){
           break;
        } else if (num[i]>200){
            maior200++;
        }
        
        
        i++;
    };
    
    nummedia=media(i, j, num, somapmedia, nummedia);
    printf("A media dos numeros eh %.2lf \n\n", nummedia);
    
    soma=somaq(i, j, num, soma);
    printf("A soma dos quadrados dos numeros eh %.2lf\n\n", soma);
    
    produto=prodcubo(i, j, num, produto);
    printf("O produto do cubo dos numeros eh %.2lf\n\n", produto);
    printf("%d numeros iniciais foram maiores que 200\n\n", maior200);
    
    
    return 0;

}

double media(double i, int j, double num[j], double soma, double resultado){
   
    j=0;

    for (j = 0; j < i; j++){
        soma+=num[j];    
    }

    resultado=soma/i;
    return resultado;
}


double somaq(double i, int j, double num[j], double somaq){
    j=0;

    for (j = 0; j < i; j++){
        somaq+=(num[j]*num[j]);
    }

    
    return somaq;
}


double prodcubo(double i, int j, double num[j], double prodc){
    j=0;
    prodc=1;

    for (j = 0; j < i; j++){
        prodc=prodc*(num[j]*num[j]*num[j]);
    }
    
    return prodc;
}
