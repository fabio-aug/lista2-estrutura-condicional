import javax.swing.*;

public class FabioAugusto_24 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int produto = new Integer(JOptionPane.showInputDialog("Digite o código do produto: "));
        int quatidade = new Integer(JOptionPane.showInputDialog("Digite a quantidade comprada: "));
        int valor = 0;

        //Verificação de código

        if (produto >= 1 && produto <= 10) {
            valor = 10 * quatidade;
        } else if (produto >= 11 && produto <= 20) {
            valor = 20 * quatidade;
        } else if (produto >= 21 && produto <= 30) {
            valor = 30 * quatidade;
        } else if (produto >= 31 && produto <= 40) {
            valor = 40 * quatidade;
        } else {
            JOptionPane.showMessageDialog(null, "Código inválido, não existe produto com esse código");
        }

        //Verificação de preço

        double totalPagar = 0;
        if (valor < 250) {
            totalPagar = valor - (valor * 0.05);
        } else if (valor >= 250 && valor <= 500) {
            totalPagar = valor - (valor * 0.10);
        } else {
            totalPagar = valor - (valor * 0.15);
        }

        JOptionPane.showMessageDialog(null, "O valor a ser pago é: R$" + totalPagar);
    }
}
