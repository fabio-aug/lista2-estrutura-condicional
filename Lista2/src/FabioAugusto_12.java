import javax.swing.*;

public class FabioAugusto_12 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double idade = new Double(JOptionPane.showInputDialog("Digite a idade do narrador: "));
        if (idade < 5) {
            JOptionPane.showMessageDialog(null, "Idade inválida");
        } else if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "Infantil");
        } else if (idade >= 8 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "Juvenil");
        } else if (idade >= 11 && idade <= 15) {
            JOptionPane.showMessageDialog(null, "Adolescente");
        } else if (idade >= 16 && idade <= 40) {
            JOptionPane.showMessageDialog(null, "Adulto");
        } else {
            JOptionPane.showMessageDialog(null, "Sênior");
        }
    }
}
