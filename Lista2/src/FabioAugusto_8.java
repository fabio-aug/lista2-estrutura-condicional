import javax.swing.*;

public class FabioAugusto_8 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double salario = new Double(JOptionPane.showInputDialog("Informe seu salário:"));
        double salarioFinal = 0;
        if (salario < 700 ) {
            salarioFinal = salario + (salario * 0.30);
        } else {
            salarioFinal = salario + (salario * 0.10);
        }
        JOptionPane.showMessageDialog(null, "O novo salário é: " + salarioFinal);
    }
}
