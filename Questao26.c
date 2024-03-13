#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    double resultado, n=10;

    for (n = 10; n <= 100000; n+=10)
    {
        resultado=pow((1+(1/n)),n);
        printf("%.51lf\n", resultado);
    }
    

    return 0;

}