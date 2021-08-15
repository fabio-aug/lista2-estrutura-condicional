import javax.swing.*;

public class FabioAugusto_25 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Informe o sexo  ('M' - Masculino ou 'F' - Feminino): ");
        double altura = new Double(JOptionPane.showInputDialog("Informe sua altura: "));

        if (sexo.equals("M")) {
            double homens = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: " + homens);
        } else {
            double mulher = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: " + mulher);
        }
    }
}
