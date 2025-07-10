#include <stdio.h>


// FUNCOES =====================================================================

int recursividade(int moedas[], int qtdTM, int valor) {    
    if(valor == 0 || valor == 0){
        return 0;
    } else if(valor >= moedas[qtdTM-1]){
        return recursividade(moedas, qtdTM, valor - moedas[qtdTM-1]) + 1;
    } else {
        return recursividade(moedas, qtdTM - 1, valor);
    }
}

int guloso(int moedas[], int qtdMoedas, int valor) {

}

int forcaBruta(int moedas[], int qtdMoedas, int valor) {

}

// MAIN ========================================================================
int main(int argc, char *argv[]){
    int moedas[] = {1, 3, 4};
    int qtdTM = 3;
    int valor = 6;

    printf("\nA quantidade de moedas sera: %d", recursividade(moedas, qtdTM, valor));

    return 0;
}