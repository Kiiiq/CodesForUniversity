#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int x, y, z, soma=0;
    int matriz[4][4][4]={{{2,2,2,2},{2,999,999,2},{2,999,999,2},{2,2,2,2}},
                      {{2,999,999,2},{999,999,999,999},{999,999,999,999},{2,999,999,2}},
                      {{2,999,999,2},{999,999,999,999},{999,999,999,999},{2,999,999,2}},
                      {{2,2,2,2},{2,999,999,2},{2,999,999,2},{2,2,2,2}}};
    int borda;

    for (x = 0; x < 4; x++){
        for (y = 0; y < 4; y++){
            for (z = 0; z < 4; z++){

                borda=0;

                if (x==3||x==0){
                    borda++;
                }
                if (y==3||y==0){
                    borda++;
                }
                if (z==3||z==0){
                    borda++;
                }

                if (borda>=2){
                    soma+=matriz[x][y][z];
                }
                
                printf("\n%i",matriz[x][y][z]);
                printf("        %i",soma);
           
            }
        }
    }
    
    printf ("\n\n\n\n\n\n\n%i", soma);

    return 0;

}