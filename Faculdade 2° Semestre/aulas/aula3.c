#include <stdio.h>
#include <locale.h>

char nome [100];
int setor;

main(void)
{
    setlocale(LC_ALL, "");

    printf("Qual o nome do funcionário: ");
    scanf('%s', &nome);
    
    printf("Digite o setor: ");
    scanf('%c', &setor);

    if ((setor == 'A') || (setor == 'a') || (setor == '111') || (setor == 'TEC') || (setor == 'tec'))
    {
        printf("%s", nome);
        printf(" foi cadastrado no Setor do Tecnico");
    }
    else
    {
        if ((setor == 'B') || (setor == 'b') || (setor == '112') || (setor == 'ANALIST') || (setor == 'analist'))
        {
            printf("%s", nome);
            printf(" foi cadastrado no Setor do Analista");
        }
        else
        {
            if ((setor == 'C') || (setor == 'c') || (setor == '122') || (setor == 'GER') || (setor == 'ger'))
            {
                printf("%s", nome);
                printf(" foi cadastrado no Setor do Gerente");
            }
            else
            {
                if ((setor == 'D') || (setor == 'd') || (setor == '233') || (setor == 'DIR') || (setor == 'dir'))
                {
                    printf("%s", nome);
                    printf(" foi cadastrado no Setor do Diretor");
                }
                else
                {
                    printf("Valor inválido.");
                }
            }
        }
    }
    fflush(stdin);
}

