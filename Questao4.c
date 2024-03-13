#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

int contador;
int num=1;
int divisor;
int contadorded;
int resto;

printf("Digite um numero\n");
scanf("%d", &num);

while(num!=0) {
    contadorded=0;
    divisor=1;
    for ( divisor= 1; divisor <= num; divisor++)
    {
       resto=num%divisor;
       if (resto==0)
       {
        contadorded++;
       }
       }
    
    if(contadorded<=2){
        contador++;
        printf("O numero %d eh primo\n\n", num);
    } else {
        printf("O numero %d nao eh primo\n\n", num);
    }

    printf("Digite um numero\n");
    scanf("%d", &num);
    
}

    printf("%d numeros primos foram apresentados",contador);
    
    
    
    
    return 0;
}