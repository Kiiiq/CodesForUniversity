#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int i=1;
    int k=3;

    double e= 2.71828;;
    double resultado;
for (i = 1; i <= 6; i++)
{


    for (k = 3; k <= 7; k++)
    {
        resultado+= ((pow(2, ((3*i)+k)))/((i*k)+1))*k;
        printf("%lf\n", resultado);
    }
    printf("------------------------------------------------------\n");
}
    printf("%lf\n", resultado);


    return 0;

}