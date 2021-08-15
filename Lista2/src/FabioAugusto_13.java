import javax.swing.*;

public class FabioAugusto_13 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double peso = new Double(JOptionPane.showInputDialog("Informe o peso"));
        double altura = new Double(JOptionPane.showInputDialog("Informe o altura"));
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso !!!");
        } else if (imc > 18.5 && imc <= 25) {
            JOptionPane.showMessageDialog(null, "Peso normal !!!");
        } else if (imc > 25 && imc <= 30) {
            JOptionPane.showMessageDialog(null, "Acima do peso !!!");
        } else {
            JOptionPane.showMessageDialog(null, "Obeso !!!");
        }
    }
}