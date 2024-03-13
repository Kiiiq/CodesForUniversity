#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int num[30], pares[30], impares[30], i, p, j, k, resto;

    while (1){
        printf("\n\ndigite um numero\n");
        scanf("%d", &num[j]);
        if (num[j]==0){
           break;
        }
        
        j++;
    };


    for (k = 0; k < j; k++){
        
        resto=num[k]%2;

        if (resto==1){
            impares[i]=num[k];
            i++;
        } else{
            pares[p]=num[k];
            p++;
        }     
    }
    
    printf("\n\nO array dos numeros pares deve ser: \n");

    for (k = 0; k < p; k++)
    {
        printf("%d  ", pares[k]);
    }

    printf("\n\nO array dos numeros impares deve ser:\n");

    for (k = 0; k < i; k++)
    {
        printf("%d  ", impares[k]);
    }

    
    


    return 0;

}