#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

    double num;
    double soma;
    double produto=1;


    printf("Digite um numero\n");
    scanf("%lf", &num);

    while(num!=0) {
       
       if (num>2 && num<100 && num!=(10,20,32))
       {
        soma= soma + num;
        produto= produto*num;

        printf("A soma ate o momento eh %.1lf e o produto eh %.1lf\n\n", soma, produto);
       }
       
       
        printf("Digite outro numero\n", num);
        scanf("%lf", &num);
    }

    printf("o produto final foi %.1lf", produto);

    return 0;

}