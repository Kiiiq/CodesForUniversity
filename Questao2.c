#include <stdio.h>
#include <stdbool.h>


int main ()
{
    
int num=0;
int soma=0;
int produto70=1;
int produto23=1;
int somaq;
int somagr=0;

double contados=0;
double media;


printf("digite um numero:\n");
scanf ("%d", &num);

    while (num !=0||num !=99||num !=14)
    {

            if(num==0||num==99||num==14)
        {
            break;
        }


        contados++;
        somagr= somagr+num;

        if (num>50 && num<150)
        {
            soma+=num;
        }
        if (num!=10 && num>5 && num<70)
        {
            produto70= produto70*num;
        }
        if (num>20 && num<30)
        {
            produto23= produto23*num;
        }
        if (num>16)
        {
           somaq=(num*num)+somaq;
        }
        
        media=somagr/contados;
    
        


    printf("digite outro numero:\n");
    scanf ("%d", &num);  
    
    }

    if (produto23==1)
    {
        produto23==0;
    }
    
    printf("A) A soma dos numeros menores que 150, maiores que 50 eh %d \n", soma);
    if (produto70==1)
    {
        printf("B) Nao tiveram numeros que estivessem nas condicoes\n");
    } else {
    printf("B) O produto dos numeros diferentes de 10, menores que 70 e maiores que 5 eh %d \n", produto70);
    }

    printf("C) A media dos numeros apresentados eh %lf \n", media);
    
    if (produto23==1)
    {
      printf("D) Nao tiveram numeros que estivessem nas condicoes\n");
    } else {
      printf("D) produto dos numeros lidos entre 20 e 30 eh %d \n", produto23);
    }
    
    printf("E) A soma dos quadrados dos numeros maiores que 16 eh %d \n", somaq);



    return 0;

}