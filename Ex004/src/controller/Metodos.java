package controller;

public class Metodos {

    public String converterParaBinario(int numero) {
        if (numero == 0) return "0"; // Condição de parada: quando o número for 0
        if (numero == 1) return "1"; // Caso base: 1 já é binário
        return converterParaBinario(numero / 2) + (numero % 2); // Chamada recursiva + resto da divisão por 2
    }
}
