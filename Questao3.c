#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

    double num;
    double soma;


    do {
        printf("Digite um numero\n");
        scanf("%lf", &num);
        soma=soma+num;
    } while (num!=0);

    printf("A soma dos numeros apresentados eh %.2lf", soma);

    return 0;

}