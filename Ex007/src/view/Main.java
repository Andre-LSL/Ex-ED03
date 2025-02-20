package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        
        int numero;
        
        // Solicita um número inteiro positivo ao usuário
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo para calcular a soma dos dígitos:"));
        } while (numero < 0);
        
        int resultado = mtd.somaDigitos(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + resultado);
    }
}