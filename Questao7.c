#include <stdio.h>
#include <stdbool.h>
#include <math.h>


int main (){

int nnr;
double a, b, c, d, x1, x2, sx;

while(a!=0){
printf("Escolha seu A\n");
scanf("%lf", &a);
printf("Escolha seu B\n");
scanf("%lf", &b);
printf("Escolha seu C\n");
scanf("%lf", &c);


d=(b*b)-(4*a*c);

if (d<0)
{
    nnr++;
    printf ("Raizes irreais\n");
} else {
    x1=((b*(-1))+sqrt(d))/2*a;
    x2=((b*(-1))-sqrt(d))/2*a;
    
    printf("as raizes sao %lf", x1);
    printf("e %lf \n", x2);

    if (x1==x2)
    {
        sx=2*x1;
        printf("A soma das raizes eh: %lf \n", sx);
    }
}
}

    printf ("o numero de raizes irreias eh %d", nnr);
    return 0;

}