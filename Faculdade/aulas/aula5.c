#include <stdio.h>

int opcao;

main(void){
    printf("1 - Parque // 2 - Cinema // 3 - Sorveteria \n");
    scanf("%i", &opcao);

    switch (opcao)
    {
    case 1:
        printf("Parque \n");
        break;
    case 2:
        printf("Cinema \n");
        break;
    case 3:
        printf("Sorveteria \n");
        break;
    default:
        printf("Inválido \n");
        break;
    }

    return 0;



}