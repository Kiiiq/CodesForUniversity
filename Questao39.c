#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int size=7;
    int palindromo[]= {4,1,73,54,24,98,2};
    int inverso[7], bubblesorter;
    int i;

    bool ehpalindromo=true;

    for (size_t i = 0; i < size; i++)
    {
        inverso[i]=palindromo[i];
    }


    for (size_t i = 0; i < size-1; i++)
    {
        for (size_t j = 0; j < size-i-1; j++)
        {

            bubblesorter=inverso[j];
            inverso[j]=inverso[j+1];
            inverso[j+1]=bubblesorter;
        }
        
    }

    for (size_t i = 0; i < size; i++)
    {
        printf("%i, ",palindromo[i]);
    }

    printf("\n\n\n");

    for (size_t i = 0; i < size; i++)
    {
        printf("%i, ",inverso[i]);
    }
    
    for (size_t i = 0; i < size; i++)
    {
        if (palindromo[i]!=inverso[i])
        {
            ehpalindromo=false;
            break;
        }
        
    } 

    if (ehpalindromo=true)
    {
        printf("eh um palindromo");
    } else {
        printf("nao eh um palindromo");
    }
    


    return 0;

}