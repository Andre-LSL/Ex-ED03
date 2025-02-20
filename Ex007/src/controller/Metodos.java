package controller;

public class Metodos {

    public int somaDigitos(int numero) {
        if (numero == 0) return 0; // Condição de parada: quando o número for 0, a soma terminou
        return (numero % 10) + somaDigitos(numero / 10); // Último dígito + soma dos dígitos restantes
    }
}
