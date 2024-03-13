#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


int main (){

    double num;
    double maiornum;



    printf("Digite um numero\n");
    scanf("%lf", &num);

    while(num!=0) {
       
       if (num>maiornum)
       {
       maiornum=num;
       }
       
       
        printf("Digite outro numero\n", num);
        scanf("%lf", &num);
    }

    printf("o maior numero da sequencia foi %.1lf", maiornum);

    return 0;

}