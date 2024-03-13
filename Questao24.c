#include<stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main()

{

    int v1,v2,resultado;
    char operador;
  


    printf ("Escreva um operador (+, -, *, /) \n");
    scanf("%c", &operador);
    
    printf ("Digite um numero\n");
    scanf ("%d",&v1);
  
    printf ("Digite outro numero\n");
    scanf ("%d",&v2);
  
    switch(operador) {

        case '+': 
            resultado=v1+v2;
            printf("\nA soma eh %d",resultado);
            break;

        case '-':  
            resultado=v1-v2;
            printf("\nA diferenca eh %d",resultado);
            break;

        case '*': 
            resultado=v1*v2;
            printf("\nO produto eh %d",resultado);
            break;

        case '/': 
            resultado=v1/v2;
            printf("\nO resultado da divisao eh %d",resultado);
            break;

        default: printf ("Operador Errado");
    }

  return 0;
}