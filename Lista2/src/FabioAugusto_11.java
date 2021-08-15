import javax.swing.*;

public class FabioAugusto_11 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double x = new Double(JOptionPane.showInputDialog("Informe o valor de X: "));
        if (x <= 1) {
            JOptionPane.showMessageDialog(null, "O valor de X é: " + 1);
        } else if (x > 1 && x <= 2) {
            JOptionPane.showMessageDialog(null, "O valor de X é: " + 2);
        } else if (x > 2 && x <= 3) {
            JOptionPane.showMessageDialog(null, "O valor de X é: " + (x * x));
        } else {
            JOptionPane.showMessageDialog(null, "O valor de X é: " + (x * x * x));
        }
    }
}
