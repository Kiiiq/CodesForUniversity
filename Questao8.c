#include <stdio.h>
#include <stdbool.h>
#include <math.h>


int main (){

int nnr, vs,npx;
double a, b, c, d, x1, x2, sx, px;

while(1){
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

    if (x1<10 && x1>5 && x2<10 && x2>5)
    {
        sx=x1+x2;
        printf ("a soma das raizes eh %lf\n\n", sx);
        vs++;
    } else if (x1 < 2 && x2 < 2)
    {
        px=x1*x2;
        printf ("o produto das raizes eh %lf\n\n", px);
        npx++;
    }else if (x1 == 0 && x2 == 0)
    {
        printf ("as raizes se multiplicaram %d vezes\n", npx);
        printf ("as raizes foram somadas %d vezes\n", vs);
        printf ("as raizes foram irreais %d vezes", nnr);
    }
    
    
    
    
}
}

    printf ("%d", nnr);
    return 0;

}