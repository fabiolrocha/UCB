#include <stdio.h>
#include <unistd.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>

int telefone[10];
int opcao[10];
int quantidade;
char nome[10][100];
char pet[10][100];
char pet_banho[10][100];

char dia_escolhido_relatorio;
char nome_escolhido_relatorio;
char dr_escolhido_relatorio;

void consulta()
{
    printf("=== Super_Petshop_Fabio_ES ===\n\n");

    dias();
    consultasmarcar();
    drs();
    relatorioconsulta();

}
int dias()
{

    int opcao_consulta_dia;
    char dia_escolhido;

    printf("Dias disponiveis para consulta: \n");
    printf("1 - Segunda \n 2 - Quinta \n");
    printf("Escolhe qual dia: ");
    scanf("%d", &opcao_consulta_dia);

    switch (opcao_consulta_dia)
    {
    case 1:
        scanf("Data escolhida: Segunda Feira", &dia_escolhido);

        system("cls");
        break;

    case 2:
        scanf("Data escolhida: Quinta Feira", &dia_escolhido);

        system("cls");
        break;

    default:

        printf("Opção invalida, tente novamente...");
        return dias();

        break;
    }

    dia_escolhido = dia_escolhido_relatorio;

    system("cls");
}
int consultasmarcar()
{

    int quantidade_banho;
    int opcao_consulta_cliente;
    char nome_banho[10];
    char nome_escolhido;

    quantidade_banho = quantidade;
    nome_banho[10] = nome[10];

    printf("Clientes cadastrados: \n");
    for (int i = 0; i < quantidade_banho; i++)
    {
        printf("Nome do cliente %d: %s\n", i + 1, nome_banho[10]);
    }

    printf("Qual cliente irá marcar a consulta: ");
    scanf("%d", &opcao_consulta_cliente);

    switch (opcao_consulta_cliente)
    {
    case 1:
        scanf("Primeiro nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 2:
        scanf("Segundo nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 3:
        scanf("Terceiro nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 4:
        scanf("Quarto nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 5:
        scanf("Quinto nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 6:
        scanf("Sexto nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 7:
        scanf("Sétimo nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 8:
        scanf("Oitavo nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 9:
        scanf("Nono nome escolhido", &nome_escolhido);

        system("cls");
        break;
    case 10:
        scanf("Décimo nome escolhido", &nome_escolhido);

        system("cls");
        break;

    default:

        printf("Opção invalida, tente novamente...");

        return cadastrados();

        break;
    }

    system("cls");

    nome_escolhido = nome_escolhido_relatorio;

}
int drs()
{

    int opcao_consulta_dr;
    char dr_escolhido;

    printf("1 - Dr. Fábio \n 2 - Dr. Fabiano\n");
    printf("Qual Dr. deseja: ");
    scanf("%d", &opcao_consulta_dr);

    switch (opcao_consulta_dr)
    {
    case 1:
        scanf("Dr. Fábio foi escolhido", &dr_escolhido);

        system("cls");
        break;

    case 2:
        scanf("Dr. Fabiano foi escolhido", &dr_escolhido);

        system("cls");
        break;

    default:

        printf("Opção invalida, tente novamente...");
        return drs();

        break;
    }

    system("cls");

    dr_escolhido = dr_escolhido_relatorio;
}
int relatorioconsulta()
{
    printf("Consulta marcada: \n");
    printf("%s \n", dia_escolhido_relatorio);
    printf("%s \n", nome_escolhido_relatorio);
    printf("%s \n", dr_escolhido_relatorio);
}

