package controller;

public class Metodos {

    private double fatorial(int n) {
        if (n == 1) return 1; // Condição de parada: fatorial de 1 é 1
        return n * fatorial(n - 1); // Relação de recorrência: n! = n * (n - 1)!
    }

    public double somatoriaSS(int n) {
        if (n == 1) return 1; // Condição de parada: o primeiro termo é 1
        return (1.0 / fatorial(n)) + somatoriaSS(n - 1); // Relação recursiva da somatória
    }
}
