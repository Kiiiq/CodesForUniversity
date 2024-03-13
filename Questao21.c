#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){
    
    int num[100];
    int i, j, size, temp;
    int k=1;

    while (1){
        printf("Digite um numero\n");
        scanf("%d", &num[size]);
        
        if (num[size]==0){
            break;
        }
        
        size++;
    }
    

    for ( i = 0; i < size; i++){
        for ( j = 0; j < size; j++){
            if (num[j]<num[j+1]){
                temp=num[j+1];
                num[j+1]=num[j];
                num[j]=temp;
            }    
        }
    }
    

    printf("%d", num[0]);
    for (k = 1; k < size; k++){
        printf(", %d", num[k]);
    }

    for ( i = 0; i < size; i++){
        j=0;
        for ( j = 0; j < size-1; j++){
            if (num[j]>num[j+1]){
                temp=num[j+1];
                num[j+1]=num[j];
                num[j]=temp;
            }    
        }
    }
    
    printf("\n%d", num[0]);
    for (k = 1; k < size; k++){
        printf(", %d", num[k]);
    }
    

    return 0;

}