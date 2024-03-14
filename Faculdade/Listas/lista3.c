#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <unistd.h>

char nome[100], telefone[50], endereço[100];
int senha;

void Login()
{

    int senhacorreta = 123;

    printf("====Login====\n\n");

    do
    {
        printf("Digite a senha: ");
        scanf("%i", &senha);

        system("cls");

        if (senha != senhacorreta)
        {
            printf("Senha Incorreta!\n");
        }

    } while (senhacorreta != senha);

    printf("Senha Correta! \n");
    sleep(2);
    system("cls");
}

void cadastro()
{
    printf("====Cadastro de clientes====\n\n");

    printf("Digite o nome do cliente: ");
    fflush(stdin);
    scanf("%s", &nome);

    printf("Digite o telefone do cliente: ");
    fflush(stdin);
    scanf("%s", &telefone);

    printf("Digite o endereço do cliente: ");
    fflush(stdin);
    scanf("%s", &endereço);

    system("cls");
    sleep(1);

    printf("Cliente cadastrado com sucesso:\n");
    printf("Nome: %s\n", &nome);
    printf("Telefone: %s\n", &telefone);
    printf("Endereço: %s\n", &endereço);

    sleep(2);
    system("cls");
    return menu();
    fflush(stdin);
}

void computadores()
{
    int opção, opção2, opção3;

    printf("====Compra de computadores====\n\n");

    printf("Computador 1 - Intel i5 15400F / RTX 3060 / 16GB RAM / SSD 512GB /\n");
    printf("Computador 2 - Intel i9 15400F / RTX 4060TI / 32GB RAM / SSD 1024GB /\n");
    printf("Computador 3 - Intel i7 10400F / GTX 1060TI SUPER / 8GB RAM / SSD 512GB /\n");
    printf("Qual computador deseja: ");
    scanf("%i", &opção);
    system("cls");

    switch (opção)
    {
    case 1:
        printf("Você escolheu o Computador 1\n");
        sleep(1);
        printf("O seu valor é R$5.400,00\n\n");
        sleep(1);

        printf("==Cores disponiveis:==\n");

        printf("Cor 1 - Azul\n");
        printf("Cor 2 - Branco\n");
        printf("Cor 3 - Vermelho\n");

        printf("Qual cor deseja: ");
        scanf("%i", &opção2);

        system("cls");

        switch (opção2)
        {
        case 1:
            printf("Você escolheu a Cor 1\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");

                break;
            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");
                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");
                break;

            default:
                break;
            }
            break;

        case 2:
            printf("Você escolheu a Cor 2\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");
                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");
                break;

            default:
                break;
            }
            break;

        case 3:
            printf("Você escolheu a Cor 3\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito\n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro\n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");

                break;

            case 3:
                printf("Opção escolhida: PIX\n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$5.400,00");

                break;

            default:
                break;
            }
            break;

        default:
            break;
        }

        break;

    case 2:
        printf("Você escolheu o Computador 2\n");
        sleep(1);
        printf("O seu valor é R$7.999,99\n\n");
        sleep(1);

        printf("==Cores disponiveis:==\n");

        printf("Cor 1 - Preto\n");
        printf("Cor 2 - Branco\n");
        printf("Cor 3 - Verde\n");

        printf("Qual cor deseja: ");
        scanf("%i", &opção2);

        system("cls");

        switch (opção2)
        {
        case 1:
            printf("Você escolheu a Cor 1\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito\n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro\n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            default:
                break;
            }
            break;

        case 2:
            printf("Você escolheu a Cor 2\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            default:
                break;
            }
            break;

        case 3:
            printf("Você escolheu a Cor 3\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$7.999,99");

                break;

            default:
                break;
            }
            break;

        default:
            break;
        }

        break;

    case 3:
        printf("Você escolheu o Computador 3\n");
        sleep(1);
        printf("O seu valor é R$2.500,00\n\n");
        sleep(1);

        printf("==Cores disponiveis:==\n");

        printf("Cor 1 - Preto\n");
        printf("Cor 2 - Azul\n");
        printf("Cor 3 - Vermelho\n");

        printf("Qual cor deseja: ");
        scanf("%i", &opção2);

        system("cls");

        switch (opção2)
        {
        case 1:
            printf("Você escolheu a Cor 1\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n\n");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            default:
                break;
            }
            break;

        case 2:
            printf("Você escolheu a Cor 2\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            default:
                break;
            }
            break;

        case 3:
            printf("Você escolheu a Cor 3\n");
            sleep(1);

            printf("Qual será a forma de pagamento:\n");

            printf("1 - Cartão de Débito\n");
            printf("2 - Dinheiro\n");
            printf("3 - PIX\n");
            printf("Digite: ");
            scanf("%i", &opção3);

            system("cls");

            switch (opção3)
            {
            case 1:
                printf("Opção escolhida: Cartão de Débito \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            case 2:
                printf("Opção escolhida: Dinheiro \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            case 3:
                printf("Opção escolhida: PIX \n\n");

                sleep(1);

                printf("Carrinho:\n ");
                printf("-- Computador 3 -- R$2.500,00");

                break;

            default:
                break;
            }
            break;

        default:
            break;
        }

        break;

    default:
        break;
    }
    sleep(1);
    system("cls");
    fflush(stdin);
}

void perifericos()
{

    int opção, opção3, quantidade;

    printf("====Compra de perifericos====\n\n");

    printf("Periferico 1 - Mouse Razer Death Chroma \n");
    printf("Periferico 2 - Fones de Ouvido Razer\n");
    printf("Periferico 3 - Teclado semi-mecânico Razer\n");
    printf("Qual periferico deseja: ");
    scanf("%i", &opção);
    system("cls");

    switch (opção)
    {
    case 1:
        printf("Você escolheu o Periferico 1\n");
        sleep(1);
        printf("O seu valor é R$350,50\n\n");
        sleep(1);

        printf("Quantos Deseja: ");
        scanf("%i", &quantidade);

        printf("\nQual será a forma de pagamento:\n");

        printf("1 - Cartão de Débito\n");
        printf("2 - Dinheiro\n");
        printf("3 - PIX\n");
        printf("Digite: ");
        scanf("%i", &opção3);

        system("cls");

        switch (opção3)
        {
        case 1:
            printf("Opção escolhida: Cartão de Débito \n\n");

            sleep(1);

            break;
        case 2:
            printf("Opção escolhida: Dinheiro \n\n");

            sleep(1);
            break;

        case 3:
            printf("Opção escolhida: PIX \n\n");

            sleep(1);
            break;

        default:
            break;
        }
        break;
    case 2:
        printf("Você escolheu o Periferico 2\n");
        sleep(1);
        printf("O seu valor é R$550,50\n\n");
        sleep(1);

        printf("Quantos Deseja: ");
        scanf("%i", &quantidade);

        printf("\nQual será a forma de pagamento:\n");

        printf("1 - Cartão de Débito\n");
        printf("2 - Dinheiro\n");
        printf("3 - PIX\n");
        printf("Digite: ");
        scanf("%i", &opção3);

        system("cls");

        switch (opção3)
        {
        case 1:
            printf("Opção escolhida: Cartão de Débito \n\n");

            sleep(1);

            break;
        case 2:
            printf("Opção escolhida: Dinheiro \n\n");

            sleep(1);
            break;

        case 3:
            printf("Opção escolhida: PIX \n\n");

            sleep(1);

            break;

        default:
            break;
        }
        break;
    case 3:
        printf("Você escolheu o Periferico 3\n");
        sleep(1);
        printf("O seu valor é R$600,50\n\n");
        sleep(1);

        printf("Quantos Deseja: ");
        scanf("%i", &quantidade);

        printf("\nQual será a forma de pagamento:\n");

        printf("1 - Cartão de Débito\n");
        printf("2 - Dinheiro\n");
        printf("3 - PIX\n");
        printf("Digite: ");
        scanf("%i", &opção3);

        system("cls");

        switch (opção3)
        {
        case 1:
            printf("Opção escolhida: Cartão de Débito \n\n");

            sleep(1);

            break;
        case 2:
            printf("Opção escolhida: Dinheiro \n\n");

            sleep(1);
            break;

        case 3:
            printf("Opção escolhida: PIX \n\n");

            sleep(1);
            break;

        default:
            break;
        }
        break;

    default:
        break;
    }
    sleep(1);
    system("cls");
    fflush(stdin);
    return menu();
}

void menu(){

    int opção;
    
    printf("==== MENU PRINCIPAL ====\n\n");

    printf("Opções principais:\n\n");

    printf("Opção 1 - Cadastro de cliente.\n");
    
    printf("Opção 2 - Compra de computadores.\n");
    
    printf("Opção 3 - Compra de periféricos.\n");
    
    printf("Opção 4 - Sair do programa.\n\n");
    
    sleep(1);

    printf("Qual opção deseja: ");
    fflush(stdin);
    scanf("%i", &opção);
    system("cls");
    
    switch (opção)
    {
    case 1:
        cadastro();
        break;
    case 2:
        
        computadores();
        break;
    case 3:
        perifericos();
        break;

    default:
        return 0;
        break;
    }
    
    }

void main()
{
    Login();

    menu();

    return 0;
}