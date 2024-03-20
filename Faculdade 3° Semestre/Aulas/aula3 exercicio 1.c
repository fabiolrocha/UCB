#include <stdio.h>
#include <stdlib.h>

struct Pessoa
{
    char nome[1000];
    int idade;
    float altura;
    float peso;
};

float calcularIMC(struct Pessoa X);
struct Pessoa criarPessoa();

int main(){

    system("cls");

    struct Pessoa X = criarPessoa();

    printf("%s\n%d\n%.2f m\n%.2f Kg\n", X.nome, X.idade, X.altura, X.peso);
    printf("IMC: %.3f", calcularIMC(X));
    
}

float calcularIMC(struct Pessoa X){
    float IMC = X.peso/(X.altura * X.altura);
    return (IMC);
}

struct Pessoa criarPessoa() {

    struct Pessoa Sujeito;
    
    printf("Digite o nome: ");
    scanf("%s", Sujeito.nome);

    printf("Digite a idede: ");
    scanf("%d", &Sujeito.idade);

    printf("Digite a altura: ");
    scanf("%f", &Sujeito.altura);

    printf("Digite o peso: ");
    scanf("%f", &Sujeito.peso);

    return (Sujeito);
}
