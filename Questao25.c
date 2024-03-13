#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    int i=2, j, num, temp;

    printf ("Digite um numero\n");
    scanf("%d", &num);

    printf ("\n\n\n%d",num);

    while (num>1){
        
        for (i = 2; i <= num; i++){
            
            temp=num%i;
            if (temp==0){
            
                break;
            }
            
        }   

        num=num/i;
        printf("    %d\n%d",i,num);
        i=2;
    }
    

    return 0;

}