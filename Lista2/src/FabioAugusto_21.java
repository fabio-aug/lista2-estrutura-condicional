import javax.swing.*;

public class FabioAugusto_21 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int ano = new Integer(JOptionPane.showInputDialog("Informe um ano: "));
        if (ano > 0 && Integer.toString(ano).length() == 4) {
            if (ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) {
                JOptionPane.showMessageDialog(null, "O ano informado é bissexto");
            } else {
                JOptionPane.showMessageDialog(null, "O ano informado não é bissexto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O ano informado é inválido");
        }
    }
}
