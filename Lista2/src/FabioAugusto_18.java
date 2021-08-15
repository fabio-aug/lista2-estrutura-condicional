import javax.swing.*;

public class FabioAugusto_18 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Informe um número de 3 dígitos:").toLowerCase();
        String numeroInvertido = "";
        String lista[] = numero.split("");
        int posiçao = lista.length - 1;
        for (int i = 0; i < lista.length; i++) {
            numeroInvertido = numeroInvertido + lista[posiçao];
            posiçao--;
        }
        if (numero.equals(numeroInvertido)) {
            JOptionPane.showMessageDialog(null, numero + " é um palíndromo");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um palíndromo");
        }
    }
}
