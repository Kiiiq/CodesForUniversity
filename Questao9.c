#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

int main (){

    int i=0;
    int matriculas[]= {29318, 28190, 12938, 34985, 19234, 92349, 23454, 1238, 3489};
    
    double mediasala;
    double notass=0;
    double media;
    double numalunos=sizeof(matriculas)/sizeof(matriculas[0]);
    double notas[][2]={{5,7},
                       {3,9},
                       {10,6},
                       {8,7},
                       {4,2},
                       {9,8},
                       {8,9},
                       {8,8},
                       {10,10}};

    
    char nomes[][10]={"lucas",
                     "marcos",
                     "matheus",
                     "josefina",
                     "liuzimara",
                     "vitor",
                     "luigi",
                     "kadu",
                     "caique"};

    
    

    for(i=0;i<numalunos;i++){
        printf("o aluno %s com a matricula %d teve as notas %.2lf e %.2lf ", nomes[i], matriculas[i], notas[i][0], notas[i][1]);
        

        media=(notas[i][0]+notas[i][1])/2;
        printf("resultando na media %lf", media);

        if (media>=7)
        {
            printf(", logo o aluno %s esta aprovado\n\n\n", nomes[i]);
        } else {
            printf(", logo o aluno %s esta reprovado\n\n\n", nomes[i]);
        }
        
        notass=media+notass;
    }

    mediasala=notass/numalunos;
    printf("a media da sala foi %.2lf\n\n\n\n\n", mediasala);

    return 0;

}