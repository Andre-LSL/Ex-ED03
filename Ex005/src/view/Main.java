package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        
        int posicao;
        
        // Validação da entrada (deve ser entre 1 e 20)
        do {
            posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição na série de Fibonacci (entre 1 e 20):"));
        } while (posicao < 1 || posicao > 20);
        
        int resultado = mtd.fibonacci(posicao);
        System.out.println("O termo na posição " + posicao + " da sequência de Fibonacci é: " + resultado);
    }
}
