#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int i, semfreio, maiortempo, freio, maiorfreio, instantefreio, aceleracao, maioraceleracao, instanteaceleracao, velconstante=1;

    int velins[]= {40,51,19, 4, 1, 3, 9, 29,39, 57, 44,2,27,51,57,43,32,10,15,22,21,34,36,27,3,18,8,44,8,3,49,36,56,12,29,30,2,17,40,1,3,43,10,24,59,37,51,56,56,56,15,44,45,38,42,46,49,3,13,53};
    

    for (i = 0; i < 60; i++)
    {
//----------------------------------------------------------------------QUESTAO A----------------------------------------------------------------
        if (velins[i]<=velins[(i+1)])
        {
            semfreio++;
        } else {
            semfreio=0;
        }

        if (semfreio>maiortempo)
        {
            maiortempo=semfreio;
        
        }
    }    
//----------------------------------------------------------------------QUESTAO B----------------------------------------------------------------        

    for (size_t i = 1; i < 60; i++)
    {   
    
        freio=velins[i]-velins[(i+1)];
        if (freio>maiorfreio)
        {
            maiorfreio=freio;
            instantefreio=i;
        }

//----------------------------------------------------------------------QUESTAO C----------------------------------------------------------------        

        aceleracao=velins[(i)]-velins[i-1];
        if (aceleracao>maioraceleracao)
        {
            maioraceleracao=aceleracao;
            instanteaceleracao=i;
        }

//----------------------------------------------------------------------QUESTAO D----------------------------------------------------------------
       
       
        if (velins[i-1]==velins[i])
        {
            velconstante++;
        }
        


    }



    printf ("A)%d   B)%d    C)%d %d     D)%d\n", maiortempo, instantefreio, maioraceleracao, instanteaceleracao, velconstante);

    return 0;

}