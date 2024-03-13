#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdint.h>


int main (){

    char nome[30], endereco[50];
    int idade, telefone;

    printf("Digite seu nome\n");
    scanf(" %[^\n]s", &nome);
    scanf("%c");

    printf("Digite seu endereco\n");
    scanf(" %[^\n]s", &endereco);
    scanf("%c");


    printf("Digite seu numero de telefone\n");
    scanf("%d", &telefone);
    
    printf("Digite sua idade\n");
    scanf("%d", &idade);

    printf("Seu nome eh %s, voce tem %d anos, mora na rua %s e seu telefone eh %d",nome, idade, endereco, telefone);

    return 0;

}