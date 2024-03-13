#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>
#include <time.h>


int main (){

    srand(time(0));

    int cartas[52], boll, i, j, temp;

    for (i = 0; i < 52; i++){
        cartas[i]=i;
    }

    for (i = 0; i < 52; i++){
        printf("%d  ", cartas[i]);
    }

    printf("\n\n");

    for (i = 0; i < 52; i++){
        for ( j = 0; j < 52; j++){
            
            boll=rand()%2;
            
            if (boll==1){
                temp=cartas[j];
                cartas[j]=cartas[j+1];
                cartas[j+1]=temp;
            }
        }        
    }

    for (i = 0; i < 52; i++){
        printf("%d  ", cartas[i]);
    }
    
    
    

    return 0;

}