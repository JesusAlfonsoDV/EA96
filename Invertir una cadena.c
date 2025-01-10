//
// Created by usuario on 09/01/2025.
//


#include <stdio.h>
#include <string.h>

char str[100], original[100], phrase[100];
//int original, reversed, phrase;
void getInput(char* phrase){

    printf("Ingresa una cadena de caracteres: ");
    scanf("%s", original);
}

//char *reversed
void reverseString(char* original, char* reversed(char original[])) {
        int longitud = strlen(original);
        char temporal;
        for (int izquierda = 0, derecha = longitud - 1; izquierda < (longitud / 2);
             izquierda++, derecha--) {
            temporal = original[izquierda];
            original[izquierda] = original[derecha];
            original[derecha] = temporal;
             }


}


/*int phrase;
char phrase[100], original[100];*/
int main() {
 getInput(original);

    reverseString(reversed);
    //reverseString();
//printf("La cadena de caracteres original es: %s\n", original);
  return 0;
}