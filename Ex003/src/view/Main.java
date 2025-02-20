package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para inverter:");
        String resultado = mtd.inverterString(palavra);
        
        System.out.println("Palavra invertida: " + resultado);
    }
}
