#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

int valor1, valor2;

main(void){
    printf("Digite o primeiro valor: \n");
    scanf("%i", &valor1);
    printf("Digite o segundo valor: \n");
    scanf("%i", &valor2);

    system("cls");

    if (valor1 > valor2)
    {
        printf("O primeiro valor é maior. \n");

    }else if (valor1 == valor2)
    {
        printf("Os valores são iguais. \n");
    }else
    {
        printf("O segundo valor é maior. \n");
    }

    return 0;    
    

}