#include <stdio.h>
#include <locale.h>

float valor1, valor2, media;

//função//
void cadastrar(){
    printf("Digite o primeiro valor: ");
    scanf("%f", &valor1);
    printf("Digite o segundo valor: ");
    scanf("%f", &valor2);
}

//função//
void fx_media(){
    media = (valor1 + valor2) / 2 ;
}

//função//
void mostrar_resultado(){
    printf("1º valor é: %.2f\n", valor1);
    printf("2º valor é: %.2f\n", valor2);
    printf("A média é: %.2f\n", media);

    if (media >= 7)
    {
        printf("Aprovado\n");
    } else
    {
        printf("Reprovado\n");
    }
    
}


int main() {
    setlocale(LC_ALL, "");
    cadastrar();
    fx_media();
    system("cls");
    mostrar_resultado();

    return 0;

}