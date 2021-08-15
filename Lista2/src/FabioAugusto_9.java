import javax.swing.*;

public class FabioAugusto_9 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double valorCarro = new Double(JOptionPane.showInputDialog("Informe o valor do carro:"));
        int anoFabricacao = new Integer(JOptionPane.showInputDialog("Informe o ano de fabricação do carro:"));
        double imposto = 0;
        if (anoFabricacao < 1990) {
            imposto = valorCarro + (valorCarro * 0.01);
        } else {
            imposto = valorCarro + (valorCarro * 0.015);
        }
        JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + imposto);
    }
}
