#include <stdio.h>
#define n 7

int qtdSomamDez (int V[]){
    int qtd = 0;
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(V[i] + V[j] == 10){
                qtd++;
            }
        }
    }
    
    return qtd;
}


int main () {

    int vetor[] = {3, 7, 5, 5, 2, 8, 1};
    int qtdSoma = qtdSomamDez(vetor);

    printf("A quantidade de somas 10 em pares eh: %d", qtdSoma);


    return 0;
}