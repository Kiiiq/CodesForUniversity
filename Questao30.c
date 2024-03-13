#include<stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main()

{

    int v1,v2,resultado, operacao, determinante;
    char operador[20], soma[20]="soma", sub[20]="subtracao", mul[20]="multiplicacao", div[20]="divisao";
    

    scanf("%s %d %d", &operador, &v1, &v2);
    
    determinante= strcmp(operador,soma);
    if (determinante==0){
        operacao=1;
    }

    determinante= strcmp(operador,sub);
    if (determinante==0){
        operacao=2;
    }

    determinante= strcmp(operador,mul);
    if (determinante==0){
        operacao=3;
    }
    
    determinante= strcmp(operador,div);
    if (determinante==0){
        operacao=4;
    }

    
    switch(operacao) {

        case 1: 
            resultado=v1+v2;
            printf("\nA soma eh %d",resultado);
            break;

        case 2:  
            resultado=v1-v2;
            printf("\nA diferenca eh %d",resultado);
            break;

        case 3: 
            resultado=v1*v2;
            printf("\nO produto eh %d",resultado);
            break;

        case 4: 
            resultado=v1/v2;
            printf("\nO resultado da divisao eh %d",resultado);
            break;

        default: printf ("Erro na compilacao");
    }

  return 0;
}