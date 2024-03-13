#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

    double num;
    double menornum;
    double somanums;
    double produtonums=1;



    printf("Digite um numero\n");
    scanf("%lf", &num);

    while(num!=0) {
       
       if (num<menornum)
       {
       menornum=num;
       }
       
       if (num>10)
       {
        somanums+=num;
       }
       if (num>200)
       {
        produtonums=produtonums*num;
       }
       
       
        printf("Digite outro numero\n", num);
        scanf("%lf", &num);
    }

    printf("o menor numero da sequencia foi %.1lf, a soma dos numeros maiores q 10 lidos foi %.1lf e o produto dos numeros maiores que 200 foi %.1lf", menornum, somanums, produtonums);

    return 0;

}