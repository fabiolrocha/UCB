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

char opcao_consulta_dia_relatorio;
char opcao_consulta_cliente_relatorio;
char opcao_consulta_dr_relatorio;



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

    printf("Dias disponiveis para consulta: \n");
    printf("1 - Segunda \n 2 - Quinta \n");
    printf("Escolhe qual dia: ");
    scanf("%d", &opcao_consulta_dia);

    system("cls");

    opcao_consulta_dia_relatorio = opcao_consulta_dia;
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

    system("cls");

    opcao_consulta_cliente_relatorio = opcao_consulta_cliente;

}

int drs()
{

    int opcao_consulta_dr;

    printf("1 - Dr. Fábio \n 2 - Dr. Fabiano\n");
    printf("Qual Dr. deseja: ");
    scanf("%d", &opcao_consulta_dr);

    system("cls");

    opcao_consulta_dr_relatorio = opcao_consulta_dr;
}

int relatorioconsulta()
{
    switch (opcao_consulta_dia_relatorio)
    {
    case 1:
        printf("Data escolhida: Segunda Feira \n");

        break;

    case 2:
        printf("Data escolhida: Quinta Feira \n");

        break;

    default:

        printf("Opção invalida, tente novamente...");
        return dias();

        break;
    }

    switch (opcao_consulta_cliente_relatorio)
    {
    case 1:
        printf("Primeiro nome escolhido: %s", nome[1]);

        break;
    case 2:
        printf("Segundo nome escolhido: %s", nome[2]);

        break;
    case 3:
        printf("Terceiro nome escolhido: %s", nome[3]);

        break;
    case 4:
        printf("Quarto nome escolhido: %s", nome[4]);

        
        break;
    case 5:
        printf("Quinto nome escolhido: %s", nome[5]);

        break;
    case 6:
        printf("Sexto nome escolhido: %s", nome[6]);

        break;
    case 7:
        printf("Sétimo nome escolhido: %s", nome[7]);

        break;
    case 8:
        printf("Oitavo nome escolhido: %s", nome[8]);

        break;
    case 9:
        printf("Nono nome escolhido: %s", nome[9]);

        break;
    case 10:
        printf("Décimo nome escolhido: %s", nome[10]);

        break;

    default:

        printf("Opção invalida, tente novamente...");

        return cadastrados();

        break;
    }

    switch (opcao_consulta_dr_relatorio)
    {
    case 1:
        printf("Dr. Fábio foi escolhido");

        break;

    case 2:
        printf("Dr. Fabiano foi escolhido");

        break;

    default:

        printf("Opção invalida, tente novamente...");
        return drs();

        break;
    }
}



void sair()
{
    printf("=== Super_Petshop_Fabio_ES ===\n\n");

    char opcao_sair;

    printf("Você deseja sair? S / N");
    scanf("%s", opcao_sair);

    if (opcao_sair == "S" || opcao_sair == "s")
    {
        return 0;
    }
    else if (opcao_sair == "N" || opcao_sair == "n")
    {
        return menu();
    }
    else
    {
        printf("Opção invalida, tente novamente");
        return sair();
    }
}
