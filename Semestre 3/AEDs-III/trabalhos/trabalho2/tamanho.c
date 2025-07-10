#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

#define LOG10_CONSTANTE -7.9208187548L
#define LOG10_DIA 4.936513L
#define LOG10_ANO 7.498940L
#define LOG10_E 0.4342944819L // log10(e)

long double log10_fatorial_stirling(int n) {
    if (n == 0 || n == 1) return 0.0L;
    long double n_ld = (long double)n;
    return 0.5L * log10l(2.0L * acosl(-1.0L) * n_ld) + 
           n_ld * log10l(n_ld) - 
           n_ld * LOG10_E;
}

int main() {
    setlocale(LC_ALL, "C"); // Evita bug de acentos no Windows

    FILE *arquivo = fopen("entradas.txt", "r");
    if (!arquivo) {
        printf("Erro ao abrir o arquivo 'entradas.txt'.\n");
        return 1;
    }

    int n;
    while (fscanf(arquivo, "%d", &n) == 1) {
        long double log_fat = log10_fatorial_stirling(n);
        long double log_tempo = LOG10_CONSTANTE + log_fat;

        printf("n = %d -> Tempo estimado ≈ 10^%.4Lf ", n, log_tempo);

        if (log_tempo > LOG10_ANO)
            printf("anos\n");
        else if (log_tempo > LOG10_DIA)
            printf("dias\n");
        else
            printf("segundos\n");
    }

    fclose(arquivo);
    return 0;
}
