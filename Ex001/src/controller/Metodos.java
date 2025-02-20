package controller;

public class Metodos {
   
    public int contarDigitos(int numero) {
        if (numero < 10) return 1; // Condição de parada: quando sobra apenas um dígito
        return 1 + contarDigitos(numero / 10); // Redução do problema (removendo um dígito)
    }
}
