#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

int contador;
int num;
int somapares=0;
int somatotal;
int produtoimpar=1;

printf("Digite um numero\n");
scanf("%d", &num);

while(num!=0) {
    contador=0;
    while (num>contador)
    {
        contador=contador+2;
    }
    
    if (num==contador){
        somapares+=num;
        printf("O numero %d eh par, a soma dos numeros pares ate o momento eh %d\n\n", num, somapares);
    } else if (num<contador){        
        produtoimpar=num*produtoimpar;
        printf("O numero %d eh impar, o produto dos numeros impares ate o momento eh %d\n\n", num, produtoimpar);
    } else{
        printf("ALGO ESTA MUITO ERRADO");
    }
    
    somatotal+=num;
    
    printf("Digite um numero\n");
    scanf("%d", &num);
    }

    printf("A soma de todos os numeros eh %d", somatotal);
    
    return 0;
}