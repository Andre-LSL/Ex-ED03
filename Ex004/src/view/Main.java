package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        
        int numero;
        
        // Validação da entrada (deve ser entre 0 e 2000)
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 2000 para converter para binário:"));
        } while (numero < 0 || numero > 2000);
        
        String binario = mtd.converterParaBinario(numero);
        System.out.println("Representação binária: " + binario);
    }
}
