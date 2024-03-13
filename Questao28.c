#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){
    
    int j, i;

    float matriz[5][3]={{ 3,12, 5},
                        {10,15,43},
                        { 2,60,96},
                        {39,53,44},
                        { 7,22,13}};
    float media, soma;

    printf("-----------------------------------------MATRIZ TRANSPOSTA-----------------------------------------\n");

    for (i = 0; i < 3; i++){
        
        for (j = 0; j < 5; j++){
           
            printf("    %-8.0f",matriz[j][i]);
            
        }
        
        printf("\n");
    }
    
    printf("\n\n-----------------------------------------MATRIZ SOMADA A MEDIA-----------------------------------------\n");
    

    for (i = 0; i < 3; i++){
        
        for (j = 0; j < 5; j++){
            
            soma+=matriz[j][i];
            
        }  
    }
    
    media=soma/15;

    for (j = 0; j < 5; j++){
        
        for (i = 0; i < 3; i++){
           
            printf("    %-8.0f",(matriz[j][i]+media));
            
        }
        
        printf("\n");
    }

    printf("\n\n-----------------------------------------SOMA DOS NUMEROS DA MATRIZ-----------------------------------------\n");

    printf("    %f",soma);

    return 0;

}