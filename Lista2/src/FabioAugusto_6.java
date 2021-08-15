import javax.swing.*;

public class FabioAugusto_6 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double numero1 = new Double(JOptionPane.showInputDialog("Informe o primeiro valor:"));
        double numero2 = new Double(JOptionPane.showInputDialog("Informe o segundo valor"));
        String operacao = JOptionPane.showInputDialog("Informe a operação (+ ou - ou * ou /):");
        switch (operacao) {
            case "+":
                JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 + numero2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 - numero2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 * numero2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 / numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador inválido");
        }
    }
}
