#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int j=1;
    int i=1;
    int k=3;

    double e= 2.71828;;
    double resultado;
for  (j = 1; j <= 4; j++){
    
    for (i = 1; i <= 6; i++){


        for (k = 3; k <= 7; k++){
        
            resultado+= ((pow(2, ((j*i)+k)))/((i*k)+1))*pow((k*j),i);
            printf("%lf\n", resultado);

        }
    
        printf("------------------------------------------------------\n");
    }
    printf("loop %d\n", j);
}


    printf("%lf\n", resultado);


    return 0;

}