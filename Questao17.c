#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int i=1;

    double e= 2.71828;;
    double resultado;

    for (i = 1; i <= 9; i++)
    {
        resultado+= (pow(2, ((3*i)+(pow(i,2)))))/(i+1);
        printf("%lf\n", resultado);
    }
    
    printf("%lf\n", resultado);


    return 0;

}