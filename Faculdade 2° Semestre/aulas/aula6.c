#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

int i;
char nome[100], end[100], telefone[100], pontoref[100];

main(void)
{
    setlocale(LC_ALL, "");
    for (i = 1; i <= 5; i++)
    {
        printf("Digite o nome do fornecedor: \n");
        scanf("%s", &nome);

        printf("Digite o endereço: \n");
        scanf("%s", &end);

        printf("Digite o telefone: \n");
        scanf("%s", &telefone);

        printf("Digite o ponto de referencia: \n");
        scanf("%s", &pontoref);
    }

    system("pause");
    return 0;
}
