#include <stdio.h>
#include <unistd.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>

int i;

void login()
{
    char senha[50];
    char senhacorreta[50] = "patinha";

    printf("====Login====\n\n");

    do
    {
        printf("Digite a senha: ");
        scanf("%s", &senha);

        system("cls");

        if (strcmp(senha, senhacorreta) != 0)
        {
            printf("Senha Incorreta!\n");
        }

    } while (strcmp(senha, senhacorreta) != 0);
}

//============================//

char nome_cadastro[10][100];
char pet_cadastro[10][100];
int telefone_cadastro[10];
int quantidade_cadastro;

void fabio()
{
        printf("=== Super_Petshop_Fabio_ES ===\n\n");

    

    printf("=== Cadastro de cliente ===\n");

    printf("Quantos PETs deseja cadastrar: ");
    scanf("%d", &quantidade_cadastro);

    for (i = 0; i < quantidade_cadastro; i++)
    {
        printf("Cadastro %d\n", i + 1);
        printf("Qual o nome do cliente: ");
        scanf("%s", nome_cadastro[i]);

        printf("\nQual o nome do PET: ");
        scanf("%s", pet_cadastro[i]);

        printf("\nQual o telefone: ");
        scanf("%d", &telefone_cadastro[i]);

        printf("\n");
    }

    sleep(0.5);
    system("cls");
    return menu();
    
}

//============================//

char pet_banho_cadastro[10][100];
int opcao_banho[10];
int quantidade_banho;

void banho()
{
    printf("=== Super_Petshop_Fabio_ES ===\n\n");

    

    printf("Deseja agendar para quantos PETs: ");
    scanf("%i", &quantidade_banho);

    for (i = 0; i < quantidade_banho; i++)
    {
        printf("\n");
        printf("Banho %d\n", i + 1);
        printf("Qual o nome do PET: ");
        scanf("%s", pet_banho_cadastro[i]);

        printf("Servicos disponiveis: \n");
        printf("1 - Banho \n2 - Tosa \n3 - Banho e Tosa\n");
        printf("Escolha o seu: ");
        scanf("%i", &opcao_banho[i]);
        printf("\n");

        switch (opcao_banho[i])
        {
        case 1:
            printf("%s escolheu banho", pet_banho_cadastro[i]);
            printf("\n");
            break;

        case 2:

            printf("%s escolheu tosa", pet_banho_cadastro[i]);
            printf("\n");
            break;

        case 3:
            printf("%s escolheu banho e tosa", pet_banho_cadastro[i]);
            printf("\n");
            break;

        default:
            printf("Opção invalida... Tente novamente\n");
            sleep(0.5);
            return banho();
            break;
        }
    }

    sleep(1);
    system("cls");
    return menu();

}

//============================//

int opcao_consulta_dia;
int quantidade_banho;
int opcao_consulta_cliente;
char nome_escolhido;
int opcao_consulta_dr;

void days(){

    

    printf("Dias disponiveis para consulta: \n");
    printf("1 - Segunda \n2 - Quinta \n");
    printf("Escolhe qual dia: ");
    scanf("%d", &opcao_consulta_dia);

    system("cls");

}
void consultasmarcar(){
    printf("Clientes cadastrados: \n");
    for (i = 0; i < quantidade_cadastro; i++)
    {
        printf("Nome do cliente %d: %s\n", i + 1, nome_cadastro[i]);
    }

    printf("Qual cliente irá marcar a consulta: ");
    scanf("%d", &opcao_consulta_cliente);

    system("cls");
}
void drs()
{

    
    printf("1 - Dr. Fábio \n2 - Dr. Fabiano\n");
    printf("Qual Dr. deseja: ");
    scanf("%d", &opcao_consulta_dr);

    system("cls");

}
void relatorioconsulta()
{
    switch (opcao_consulta_dia)
    {
    case 1:
        printf("Data escolhida: Segunda Feira");

        break;

    case 2:
        printf("Data escolhida: Quinta Feira");

        break;

    default:

        printf("Opção invalida, tente novamente...");
        return days();

        break;
    }

    printf("\n");

    switch (opcao_consulta_cliente)
    {
    case 1:
        printf("Primeiro nome escolhido: %s", nome_cadastro[0]);

        break;
    case 2:
        printf("Segundo nome escolhido: %s", nome_cadastro[1]);

        break;
    case 3:
        printf("Terceiro nome escolhido: %s", nome_cadastro[2]);

        break;
    case 4:
        printf("Quarto nome escolhido: %s", nome_cadastro[3]);

        
        break;
    case 5:
        printf("Quinto nome escolhido: %s", nome_cadastro[4]);

        break;
    case 6:
        printf("Sexto nome escolhido: %s", nome_cadastro[5]);

        break;
    case 7:
        printf("Sétimo nome escolhido: %s", nome_cadastro[6]);

        break;
    case 8:
        printf("Oitavo nome escolhido: %s", nome_cadastro[7]);

        break;
    case 9:
        printf("Nono nome escolhido: %s", nome_cadastro[8]);

        break;
    case 10:
        printf("Décimo nome escolhido: %s", nome_cadastro[9]);

        break;

    default:

        printf("Opção invalida, tente novamente...");

        return consultasmarcar();

        break;
    }

    printf("\n");

    switch (opcao_consulta_dr)
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

    sleep(2);
}
void consulta()
{
    printf("=== Super_Petshop_Fabio_ES ===\n\n");

    days();
    consultasmarcar();
    drs();
    relatorioconsulta();

    system("cls");

    return menu();
}

//============================//

void relatorio()
{
    printf("=== Super_Petshop_Fabio_ES ===\n\n");
    
    printf("Clientes Cadastrados: \n");
    for (i = 0; i < quantidade_cadastro; i++)
    {
        printf("Nome do cliente %d: %s\n", i + 1, nome_cadastro[i]);
        printf("Nome do Pet %d: %s\n", i + 1, pet_cadastro[i]);
        printf("Numero do cliente %d: %d\n", i + 1, telefone_cadastro[i]);
    }

    sleep(0.5);
    printf("\n");

    
    printf("Banhos agendados: \n");
    for (i = 0; i < quantidade_banho; i++)
    {
        printf("Nome do pet %d: %s\n", i + 1, pet_banho_cadastro[i]);
        
        switch (opcao_banho[i])
        {
        case 1:
            printf("%s escolheu banho", pet_banho_cadastro[i]);
            printf("\n");
            break;

        case 2:
            printf("%s escolheu tosa", pet_banho_cadastro[i]);
            printf("\n");
            break;

        case 3:
            printf("%s escolheu banho e tosa", pet_banho_cadastro[i]);
            printf("\n");
            break;

            default:
            break;
        }
        printf("\n");
    }    
    printf("\n");

    relatorioconsulta();

    system("pause");
    system("cls");
    return menu();


}

//============================//

int sair()
{
    printf("=== Super_Petshop_Fabio_ES ===\n\n");

    printf("Volte sempre ao Super_Petshop_Fabio_ES\n");

    sleep(1);

    printf("Finalizando Programa...\n");

    sleep(0.5);
    
    return 0;
}

//============================//

void menu(){
    printf("=== Super_Petshop_Fabio_ES ===\n\n");

    int opcao_menu;

    printf("=== Voce esta no MENU ===\n");

    printf("1 - Cadastro\n2 - Agendar banho\n3 - Agendar consulta\n4 - Relatorio\n5 - Fechar programa\n");
    printf("Escolha a opcao que deseja: ");
    scanf("%i", &opcao_menu);

    switch (opcao_menu)
    {
    case 1:
        system("cls");
        fabio();
        break;
    case 2:
        system("cls");
        banho();
        break;
    case 3:
        system("cls");
        consulta();
        break;
    case 4:
        system("cls");
        relatorio();
        break;
    case 5:
        system("cls");
        sair();
        break;

    default:
        printf("Opção invalida... Tente novamente");
        return menu();

        break;
    }
}

//============================//

int main()
{

    login();

    menu();

    return 0;
}
