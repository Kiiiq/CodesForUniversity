#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){


    int primos[20];
    double dadosn[20], temp;
    int dados[]={2, 4, 35, 50, 23, 17, 9, 12, 27, 5, 14, 2, 3, 4, 1, 2, 5, 6, 8, 9};
    int i, maior, soma, divisor, contadorded, contador, j, resto, somap;

    float media, mediap;

    for (i = 0; i < 20; i++){
        
        if (dados[i]>maior){
            maior=dados[i];
        }
        
        soma+=dados[i];

            
//---------------------------------------------------------PRIMOS---------------------------------------------------
    

        contadorded=0;
        divisor=1;
        for ( divisor= 1; divisor <=dados[i] ; divisor++){
        
            resto=dados[i]%divisor;
        
            if (resto==0){
                contadorded++;
            }
        }
    

        if(contadorded<=2){
            primos[j]=dados[i];
            j++;
        }

//-------------------------------------------------------------MEDIA PONDERADA--------------------------------------------------------

        somap+=(dados[i]*i);
        mediap=somap/190;
//-------------------------------------------------------------NORMALIZACAO-----------------------------------------------------------
        temp=dados[i];
        dadosn[i]=temp/50;

    }

    media=soma/20;

    printf("    O maior numero eh:%d\n\n    A media dos numeros eh:%.1f\n\n    Os numeros primos sao:", maior, media);

    for (i = 0; i < j; i++){
        printf("%d ", primos[i]);
    }


    printf("\n\n    A media ponderada eh:%.1f\n\n    O dados normalizados sao:\n    ", mediap);

    for (size_t i = 0; i < 20; i++)
    {
        printf("%.4lf ",dadosn[i]);
    }
    
    return 0;

}