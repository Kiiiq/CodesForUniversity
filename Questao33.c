#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>

typedef struct{
    int ano;
    int mes;
    int dia;           
}data;


int main (){

data datas[40], temp;
int i, j, k;

while (1)
{
    printf("\n\ninsira uma data separada por '/' (dd/mm/aaaa)\n");
    scanf("%d/%d/%d", &datas[i].dia, &datas[i].mes,&datas[i].ano);
    if (datas[i].dia==0 && datas[i].mes==0 && datas[i].ano==0)
    {
        break;
    }
    i++;
}

for (j = 0; j < i; j++){
    for (k = 0; k < i; k++){
        if (datas[k].ano < datas[k+1].ano){

            temp= datas[k+1];
            datas[k+1]= datas[k];
            datas[k]= temp;
     
        } else if (datas[k].ano == datas[k+1].ano){
            if (datas[k].mes<datas[k+1].mes){
                
                temp= datas[k+1];
                datas[k+1]= datas[k];
                datas[k]= temp;
            
            } else if (datas[k].mes==datas[k+1].mes){
                if (datas[k].dia<datas[k+1].dia){
                    
                    temp= datas[k+1];
                    datas[k+1]= datas[k];
                    datas[k]= temp;
                }   
            }
        }
    }
}

printf("\n\ndatas organizadas:\n\n");

for (j= 0; j < i; j++){
    printf("%d/%d/%d    ",datas[j].dia, datas[j].mes, datas[j].ano);
}

return 0;

}