#include<stdio.h>
#include<locale.h>

char letra, nome[15], curso[30];

main(void){
    setlocale(LC_ALL, "");

printf("Digite o seu primeiro nome:");
fflush(stdin);
scanf("%s", &nome);
printf ("Digite seu curso superior: ");
fflush(stdin);
fgets(curso, 15, stdin);
system("cls");

//impressões

printf("letra: %s \n Nome: %s", letra, nome);

}