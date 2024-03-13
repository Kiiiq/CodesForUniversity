#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>



int main (){

    int i;

    double e= 2.71828;;
    double resultado;

    for (i = 0; i <= 6; i++)
    {
        resultado+= (pow(i, 2*i)) + (pow(e, i))*i*sin(2*i);
        printf("%lf\n", resultado);
    }
    
    printf("%lf\n", resultado);

    return 0;

}