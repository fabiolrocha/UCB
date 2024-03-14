#include <stdio.h>
#include <locale.h>
#include <string.h>

char nome[50]; 
char setor[3];

main(void)
{
    setlocale(LC_ALL, "");
    printf("Nome completo:");
    fflush(stdin);
    fgets(nome, 50, stdin);

    printf("Setor: ");
    fflush(stdin);
    gets(setor);

    if ((strcmp(setor, "A") == 0) || (strcmp(setor, "a") == 0) || (strcmp(setor, "111") == 0) || (strcmp(setor, "TEC") == 0) || (strcmp(setor, "tec") == 0))
        {
    printf("Nome: %s" 
    "Bem vindo ao setor Técnico!", nome);
        }
    else if ((strcmp(setor, "B") == 0) || (strcmp(setor, "b") == 0) || (strcmp(setor, "112") == 0) || (strcmp(setor, "AN") == 0) || (strcmp(setor, "an") == 0))
        {
    printf("Nome: %s"
    "Bem vindo ao setor Analista!", nome);
        }
    else if ((strcmp(setor, "C") == 0) || (strcmp(setor, "c") == 0) || (strcmp(setor, "122") == 0) || (strcmp(setor, "GER") == 0) || (strcmp(setor, "ger") == 0))
        {
    printf("Nome: %s"
    "Bem vindo ao setor Gerencia!", nome);
        }
    else if ((strcmp(setor, "D") == 0) || (strcmp(setor, "d") == 0) || (strcmp(setor, "233") == 0) || (strcmp(setor, "DIR") == 0) || (strcmp(setor, "dir") == 0))
        {
    printf("Nome: %s"
    "Bem vindo ao setor Diretoria!", nome);
        }
    else
    {
        printf("Valor Invalido");
    }
}