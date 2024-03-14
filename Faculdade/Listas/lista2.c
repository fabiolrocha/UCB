#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <stdlib.h>

float valor1, valor2, valor3;

main(void){
    printf("Digite o primeiro valor: \n");
    scanf("%f", &valor1);

    printf("Digite o segundo valor: \n");
    scanf("%f", &valor2);

    printf("Digite o terceiro valor: \n");
    scanf("%f", &valor3);

    system("cls");

    if (valor1 >= valor2 && valor1 >= valor3)
    {
        printf("O maior valor e: O valor 1 \n");

        if (valor2 >= valor3)
        {
            printf("O valor intermediario e: O valor 2 \n");
            printf("O menor valor e: O valor 3 \n");
        } else
        {
            printf("O valor intermediario e: O valor 3 \n");
            printf("O menor valor e: O Valor 2 \n");
        }
        
    } else if (valor2 >= valor1 && valor2 >= valor3)
    {
        printf("O maior valor e: O valor 2 \n");

        if (valor1 >= valor3)
        {
            printf("O valor intermediario e: O valor 1 \n");
            printf("O menor valor e: O valor 3 \n");
        } else
        {
            printf("O valor intermediario e: O valor 3 \n");
            printf("O menor valor e: O valor 1 \n");
        }
    } else
    {
        printf("O maior valor e: O valor 3 \n");

        if (valor1 >= valor2)
        {
            printf("O valor intermediario e: O valor 1 \n");
            printf("O menor valor e: O valor 2 \n");
        } else
        {
            printf("O valor intermediario e: O valor 2 \n");
            printf("O menor valor e: O valor 1 \n");
        }
    }
    
    return 0;




}