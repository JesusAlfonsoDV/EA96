//
// Created by usuario on 09/01/2025.
//


#include <stdio.h>
#include <string.h>

char str[100], original[100];
void getInput(char* phrase) {
    printf("Ingresa una cadena de caracteres: ");
    fgets(phrase, 100, stdin);
}

//char *reversed
void reverseString(char* original) {
    int longitud = strlen(original);
    char temporal;
    // Invertir
    for (int izquierda = 0, derecha = longitud - 1; izquierda < (longitud / 2); izquierda++, derecha--) {
        temporal = original[izquierda];
        original[izquierda] = original[derecha];
        original[derecha] = temporal;
    }
}


/*int phrase;
char phrase[100], original[100];*/
int main() {
 getInput(original);
    printf("La cadena de caracteres original es: %s", original);
    reverseString(original);
    //reverseString();

printf("La cadena de caracteres invertida es: %s", original);
  return 0;
}