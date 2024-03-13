#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>
#include <time.h>

int main (){

    srand(time(0));

    int cartas[52], i, j, usado;

    while (i<52)
    {
        cartas[i]=rand()%52;
        usado=0;

        for (j = 0; j <i; j++){

            if (cartas[i]==cartas[j]){
            usado++;
            break;
            }
            
            
        }
        

        if (usado==1){
            continue;
        } else {
            printf("%d  ", cartas[i]);
            i++;
        }
    }
    

    return 0;

}

//O tempo de processamento aumenta gracas ao aumento da checagem necessaria para garantir nao ter numeros repetidos