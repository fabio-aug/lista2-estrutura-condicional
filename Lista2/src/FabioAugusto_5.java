import javax.swing.*;

public class FabioAugusto_5 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double custoFab = new Double(JOptionPane.showInputDialog("Informe o custo de fábrica:"));
        double distribuidor = 0;
        double imposto = 0;
        if (custoFab <= 28000.00) {
            distribuidor = custoFab * 0.05;
            imposto = 0;
        } else if (custoFab >= 28000.01 && custoFab <= 45000.00) {
            distribuidor = custoFab * 0.10;
            imposto = custoFab * 0.15;
        } else {
            distribuidor = custoFab * 0.15;
            imposto = custoFab * 0.20;
        }
        JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + (custoFab + distribuidor + imposto));
    }
}
