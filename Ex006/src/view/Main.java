package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        
        int n;
        
        // Validação da entrada (deve ser um número positivo)
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo para calcular a somatória SS:"));
        } while (n < 1);
        
        double resultado = mtd.somatoriaSS(n);
        System.out.println("O valor da somatória SS até " + n + " é: " + resultado);
    }
}
