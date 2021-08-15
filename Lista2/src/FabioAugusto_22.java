import javax.swing.*;

public class FabioAugusto_22 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double numero1 = new Double(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double numero2 = new Double(JOptionPane.showInputDialog("Digite o segundo número: "));
        double numero3 = new Double(JOptionPane.showInputDialog("Digite o terceiro número: "));
        String print = "";
         if (numero1 > numero2 && numero1 > numero3) {
             if (numero2 > numero3) {
                 print = "Decrescente: " + numero1 + " - " + numero2 + " - " + numero3 +
                         "\nCrescente: " + numero3 + " - " + numero2 + " - " + numero1;
             } else {
                 print = "Decrescente: " + numero1 + " - " + numero3 + " - " + numero2 +
                         "\nCrescente: " + numero2 + " - " + numero3 + " - " + numero1;
             }
         } else if (numero2 > numero1 && numero2 > numero3) {
             if (numero1 > numero3) {
                 print = "Decrescente: " + numero2 + " - " + numero1 + " - " + numero3 +
                         "\nCrescente: " + numero3 + " - " + numero1 + " - " + numero2;
             } else {
                 print = "Decrescente: " + numero2 + " - " + numero3 + " - " + numero1 +
                         "\nCrescente: " + numero1 + " - " + numero3 + " - " + numero2;
             }
         } else {
             if (numero1 > numero2) {
                 print = "Decrescente: " + numero3 + " - " + numero1 + " - " + numero2 +
                         "\nCrescente: " + numero2 + " - " + numero1 + " - " + numero3;
             } else {
                 print = "Decrescente: " + numero3 + " - " + numero2 + " - " + numero1 +
                         "\nCrescente: " + numero1 + " - " + numero2 + " - " + numero3;
             }
         }
         JOptionPane.showMessageDialog(null, print);
    }
}
