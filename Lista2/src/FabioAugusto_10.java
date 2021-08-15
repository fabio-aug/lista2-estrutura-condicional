import javax.swing.*;

public class FabioAugusto_10 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int idade = new Integer(JOptionPane.showInputDialog("Digite a idade do paciente: "));
        double peso = new Double(JOptionPane.showInputDialog("Digite o peso do paciente: "));
        int dosagem = 0;
        int gotas = 0;
        if (idade > 12) {
            if (peso >= 60) {
                dosagem = 1000;
                gotas = dosagem / 500 * 20;
                JOptionPane.showMessageDialog(null, "O paciente deve tomar " + gotas + " gotas");
            } else {
                dosagem = 875;
                gotas = (dosagem / 500) * 20;
                JOptionPane.showMessageDialog(null, "O paciente deve tomar " + gotas + " gotas");
            }
        } else {
            if (peso >= 5 && peso <= 9) {
                dosagem = 125;
                gotas = dosagem / 500 * 20;
            } else if (peso >= 9.1 && peso < 16) {
                dosagem = 250;
                gotas = dosagem / 500 * 20;
                JOptionPane.showMessageDialog(null, "O paciente deve tomar " + gotas + " gotas");
            } else if (peso >= 16.1 && peso < 24) {
                dosagem = 375;
                gotas = dosagem / 500 * 20;
                JOptionPane.showMessageDialog(null, "O paciente deve tomar " + gotas + " gotas");
            } else if (peso >= 24.1 && peso < 30) {
                dosagem = 500;
                gotas = dosagem / 500 * 20;
                JOptionPane.showMessageDialog(null, "O paciente deve tomar " + gotas + " gotas");
            } else if (peso > 30) {
                dosagem = 750;
                gotas = dosagem / 500 * 20;
                JOptionPane.showMessageDialog(null, "O paciente deve tomar " + gotas + " gotas");
            } else {
                JOptionPane.showMessageDialog(null, "Dosagem não decidida para esse paciente");
            }
        }
    }
}
