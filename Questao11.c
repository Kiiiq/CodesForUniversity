#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

int contador;
int num;

printf("Digite um numero\n");
scanf("%d", &num);

while(num!=0) {
    contador=0;
    while (num>contador)
    {
        contador=contador+2;
    }
    
    if (num==contador){
        printf("O numero %d eh par\n\n", num);
    } else if (num<contador){
        printf("O numero %d eh impar\n\n", num);
    } else{
        printf("ALGO ESTA MUITO ERRADO");
    }
    
    printf("Digite um numero\n");
    scanf("%d", &num);
    }
    
    return 0;
}