#include <stdio.h>
#include <stdlib.h>

void exibirArray(int array[], int tamanho[]);
void modificarVetor(int *P)

void main(){
    int V[] = {7 ,8, 9, 6, 4};

    int tamanho = sizeof(V) / sizeof(int);

    exibirArray(V, tamanho);
    modificarVetor(V, tamanho);
}

void exibirArray(int Array[], int tamanho){
    for (int i = 0; i < tamanho; i++) printf("%d\t", Array[i]);
    
    printf("\n");

    tamanho++;

    printf("Exibir array: %d\n", tamanho);
}

void modificarVetor(int *P, int tamanho){

    printf("%d\n", P);

    // Obs: P é um endereço de memoria ⬆️//

    printf("%d", P[1])

    // Obs: P com um indice, serve para escolher um dos vetores ⬆️//

    for (int i = 0; i < tamanho; i ++) P[i] + 12;
}
