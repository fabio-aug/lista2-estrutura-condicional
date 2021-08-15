import javax.swing.*;

public class FabioAugusto_4 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double a = new Double(JOptionPane.showInputDialog("Informe o valor de A:"));
        double b = new Double(JOptionPane.showInputDialog("Informe o valor de B:"));
        double c = new Double(JOptionPane.showInputDialog("Informe o valor de C:"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Não é uma equação do 2° grau.");
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Não é uma equação do 1° grau.");
            } else {
                double resultado = -c / b;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Não há raízes reais.");
            } else {
                double r1 = (-b - Math.sqrt(delta)) / (2 * a);
                double r2 = (-b + Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "R1: " + r1 + "\nR2: " + r2);
            }
        }
    }
}