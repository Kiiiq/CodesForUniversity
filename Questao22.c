#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int num [20];
    int soma, size;

    double divisor, media;

    while (1){
        printf("Digite um numero\n");
        scanf("%d", &num[size]);
        
        if (num[size]==0){
            break;
        }
        
        soma+=num[size];
        size++;
        divisor++;
    }
    
    media=soma/divisor;
    printf("A soma dos numeros eh %d e a media eh %.2lf", soma, media);
    
    return 0;

}