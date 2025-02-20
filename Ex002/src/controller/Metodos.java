package controller;

public class Metodos {
    
    public int contarOcorrencias(int numero, int digito) {
        if (numero == 0) return 0; // Condição de parada: quando não há mais dígitos para verificar
        int ultimoDigito = numero % 10; // Pega o último dígito do número
        int contagem = (ultimoDigito == digito) ? 1 : 0; // Se for igual ao buscado, soma 1
        return contagem + contarOcorrencias(numero / 10, digito); // Chamada recursiva reduzindo o número
    }
}
