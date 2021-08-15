import javax.swing.*;

public class FabioAugusto_17 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double a = new Double(JOptionPane.showInputDialog("Informe a medida do lado A:"));
        double b = new Double(JOptionPane.showInputDialog("Informe a medida do lado B:"));
        double c = new Double(JOptionPane.showInputDialog("Informe a medida do lado C:"));
        if (a == b && a == c) {
            JOptionPane.showMessageDialog(null, "É Triângulo Equilátero.");
        } else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
            JOptionPane.showMessageDialog(null, "É Triângulo Isósceles.");
        } else if (a != b || a != c || b != c) {
            JOptionPane.showMessageDialog(null, "É Triângulo Escaleno.");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível formar um triangulo.");
        }
    }
}
