import javax.swing.*;

public class FabioAugusto_14 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double diametro = new Double(JOptionPane.showInputDialog("Informe um diâmetro D: "));
        double carga = new Double(JOptionPane.showInputDialog("Informe uma carga Q: "));
        int n;
        if (diametro > 100) {
            n = 2;
        } else if (diametro < 50) {
            n = 6;
        } else {
            n = 4;
        }
        double tensao = ((4 * carga) / (Math.PI * (diametro * diametro))) * n;
        JOptionPane.showMessageDialog(null, "O valor da tensão: " + tensao);
    }
}
