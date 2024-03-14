#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

char f(int X){
    if (X == 2) return(4);
    else if (X == 3) return(9);
    else if (X == 4) return(16);
    else if (X == 5) return(25);
    else{
        printf("Esse valor nao existe nessa função");
        exit(0);
    }
}

int main(){
    char valor = f(2);
    printf("A resposta é %d", valor);
}

