//
// Created by usuario on 08/01/2025.
//

#include <stdio.h>

int validatePositiveInt() {
    int num;
    do {
        printf("Introduce un numero positivo: ");
        scanf("%d", &num);
        if (num <= 0) {
            printf("El numero no es positivo.\n");
        }
    } while (num <= 0);
    return num;
}


void generateTable(int number, int table[]) {
    for (int i = 1; i <= 10; i++) {
        table[i - 1] = number * i;
    }
}


void printTable(int number, int table[]) {
    printf("Esta es la tabla del %d:\n", number);
    for (int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", number, i, table[i - 1]);
    }
}

int main() {
    int number = validatePositiveInt();
    int table[10];
    generateTable(number, table);
    printTable(number, table);

    return 0;
}

