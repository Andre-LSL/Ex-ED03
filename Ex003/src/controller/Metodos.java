package controller;

public class Metodos {

    public String inverterString(String str) {
        if (str.length() <= 1) return str; // Condição de parada: string vazia ou com 1 caractere já está invertida
        return str.substring(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
    }
}
