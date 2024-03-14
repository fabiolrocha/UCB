#include <stdio.h>
#include <locale.h>

float converter(float tempfar); //protótipo//

int main(void){
    float tempfar, tempcel;
    printf("Temperatura em Fahrenheit: ");
    scanf("%f", &tempfar);
    tempcel = converter(tempfar);
    printf("Temperatura em Celsius: %.4f", tempcel);
    
    return 0;
}

float converter(float tempfar){
    float tempcel;
    tempcel = ((tempfar - 32) * 5) / 9;
    return tempcel;
}