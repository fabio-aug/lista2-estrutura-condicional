import javax.swing.*;

public class FabioAugusto_20 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double n1 = new Double(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double n2 = new Double(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (n1 % n2 == 0) {
            JOptionPane.showMessageDialog(null, n1 + " é múltiplo de " + n2);
        } else {
            JOptionPane.showMessageDialog(null, n1 + " não é múltiplo de " + n2);
        }
    }
}
