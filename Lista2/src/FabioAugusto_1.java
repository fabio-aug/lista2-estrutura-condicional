import javax.swing.*;

public class FabioAugusto_1 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double numero = new Double(JOptionPane.showInputDialog("Informe um número:"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número informado é negativo!!!");
        } else if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número informado é positivo!!!");
        } else {
            JOptionPane.showMessageDialog(null, "O número informado é igual a zero!!!");
        }
    }
}
