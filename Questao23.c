#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int valor, i, j;

    for (size_t i = 1; i < 10; i++)
    {
        for (size_t j = 1; j < 10; j++)
        {
            valor=j*i;
            printf("%d x %d = %d\n",i,j,valor);
        }
        printf("------------------------------------------------------------------------\n");
    }
    

    return 0;

}