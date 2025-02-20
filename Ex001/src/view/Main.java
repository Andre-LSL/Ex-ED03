package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int qtdDigitos = mtd.contarDigitos(Math.abs(numero)); // Usa valor absoluto para evitar problemas com números negativos
        System.out.println("Quantidade de dígitos: " + qtdDigitos);
    }
}
