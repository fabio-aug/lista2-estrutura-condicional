import javax.swing.*;

public class FabioAugusto_2 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double numero = new Double(JOptionPane.showInputDialog("Informe um número:"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número informado é par!!!");
        } else {
            JOptionPane.showMessageDialog(null, "O número informado é impar!!!");
        }
    }
}
