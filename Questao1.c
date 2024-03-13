#include <stdio.h>
#include <stdbool.h>


int main (){
    
int num;


printf("digite um numero\n");
scanf ("%d", &num);

    while (num != 0)
    {
        if (num>=100)
        {
            printf ("\n seu numero %d cumpre uma das exigencias", num);
        } else if (num<=10)
        {
            printf ("\n seu numero %d cumpre uma das exigencias", num);
        } else if (num==20)
        {
            printf ("\n seu numero %d cumpre uma das exigencias", num);
        } else if (num==30)
        {
            printf ("\n seu numero %d cumpre uma das exigencias", num);
        } else if (num==40)
        {
            printf ("\n seu numero %d cumpre uma das exigencias", num);
        } else {
            printf ("\n seu numero %d nao cumpre nenhuma das exigencias", num);
        }


    printf("\n\n digite outro numero\n");
    scanf ("%d", &num);  
    
    }



    return 0;
}