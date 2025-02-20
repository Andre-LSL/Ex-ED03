package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        
        int numero, digito;
        
        // Validação do primeiro número (deve estar entre 10 e 999999)
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999:"));
        } while (numero < 10 || numero > 999999);
        
        // Validação do segundo número (deve ser um único dígito entre 0 e 9)
        do {
            digito = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 9:"));
        } while (digito < 0 || digito > 9);
        
        int resultado = mtd.contarOcorrencias(numero, digito);
        System.out.println("O número " + digito + " aparece " + resultado + " vezes no número " + numero);
    }
}
