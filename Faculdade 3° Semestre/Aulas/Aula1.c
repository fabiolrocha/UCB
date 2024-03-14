#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

char f(int X){
    if (X == 1) return('C');
    else if (X == 2) return('D');
    else if (X == 3) return('E');
    else if (X == 4) return('B');
    else if (X == 5) return('E');
    else {
        printf("O Valor indicado nao existe nessa função");
        exit(0);
    }
}
    
int main(){
    setlocale(LC_ALL, "portuguese");
    char ch = f(5);
    printf("A resposta é %c", ch);

}

