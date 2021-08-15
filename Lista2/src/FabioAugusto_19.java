import javax.swing.*;

public class FabioAugusto_19 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Informe um número de 4 dígitos:").toLowerCase();
        String lista[] = numero.split("");
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals("0") || lista[i].equals("1")) {
                contador++;
            }
        }
        if (contador == 4) {
            int numeroDecimal = Integer.parseInt(numero, 2);
            JOptionPane.showMessageDialog(null, "O valor " + numero + " digitado pertence aos binários\nSeu valor em decimal é: " + numeroDecimal);
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + numero + " digitado não pertence aos binários");
        }
    }
}
