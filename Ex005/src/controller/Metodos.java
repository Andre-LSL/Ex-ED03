package controller;

public class Metodos {

    public int fibonacci(int n) {
        if (n == 1 || n == 2) return 1; // Condição de parada: os dois primeiros termos são sempre 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Relação de recorrência da sequência
    }
}
