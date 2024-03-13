#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int A[5][5]={{23, 4 , 3 , 46, 3 },
                 {46, 54, 68, 92, 51},
                 {93, 71, 48, 54, 94},
                 {8 , 18, 88, 9 , 5 },
                 {24, 71, 55, 6 , 90}}; 
        
    int B[5][5]={{46, 54, 68, 92, 51},
                 {24, 71, 55, 6 , 90},
                 {23, 4 , 3 , 46, 3 },
                 {8 , 18, 88, 9 , 5 },
                 {93, 71, 48, 54, 94}};
    
    int S[5][5], Somad, Multi[5][5], i, j, alterador,d;


    //----------------------------------------------    SOMA DAS MATRIZES    ----------------------------------------------

    for (i = 0; i < 5; i++){
        for (size_t j = 0; j < 5; j++){
            
            S[i][j]=A[i][j]+B[i][j];
            printf("%-5d  ",S[i][j]);
        }
        printf("\n");
    }

printf ("\n\n");

    for (i = 0; i < 5; i++){
        for (size_t j = 0; j < 5; j++){
            Multi[i][j]=0;
            printf("%-5d  ",Multi[i][j]);
        }
        printf("\n");
    }
    //----------------------------------------------    SOMA DAS DIAGONAIS    ----------------------------------------------
    
    for ( i = 0; i < 5; i++)
    {
        Somad+=S[i][i];
    }

    printf("\n\n%d  \n\n", Somad);
    

    //----------------------------------------------     MULTIPLICACAO    ----------------------------------------------
    
    for ( i = 0; i < 5; i++,j++){
        for (size_t j = 0; j < 5; j++){
            for (size_t k = 0; k < 5; k++){
                Multi[i][j]+=A[i][k]*B[k][j];
            }
            printf("%-8d  ",Multi[i][j]);
        }
        printf("\n");
    }
    

    return 0;

}