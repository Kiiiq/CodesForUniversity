#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int i;

    double numeros[30];

    while (1){
        
        printf("Digite um numero\n");
        scanf("%lf", &numeros[i]);
       
        if (numeros[i]==0){
            break;
        }
        i++;
    }
    
    i--;
    printf("-----------------------------------------------\n",numeros[i]);


    while (1){
        printf("%.0lf\n",numeros[i]);

        if (i==0){
            break;
        }
        
        i--;
    }
      

    return 0;

}