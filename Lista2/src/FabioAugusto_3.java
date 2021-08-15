import javax.swing.*;

public class FabioAugusto_3 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double numero1 = new Double(JOptionPane.showInputDialog("Informe o primeiro número:"));
        double numero2 = new Double(JOptionPane.showInputDialog("Informe o segundo número:"));
        String print = "";
        if (numero1 == numero2) {
            print = "Os números são iguais!!!";
        } else if (numero1 > numero2) {
            if (numero1 < 0) {
                double quadrado = numero2 * numero2;
                print = "Quadrado do menor número: " + quadrado + "\nO maior número é negativo, então não possui raiz real";
            } else {
                double quadrado = numero2 * numero2;
                double raiz = Math.sqrt(numero1);
                print = "Quadrado do menor número: " + quadrado + "\nRaiz real do maior número: " + raiz;
            }
        } else {
            if (numero2 < 0) {
                double quadrado = numero1 * numero1;
                print = "Quadrado do menor número: " + quadrado + "\nO maior número é negativo, então não possui raiz real";
            } else {
                double quadrado = numero1 * numero1;
                double raiz = Math.sqrt(numero2);
                print = "Quadrado do menor número: " + quadrado + "\nRaiz real do maior número: " + raiz;
            }
        }
        JOptionPane.showMessageDialog(null, print);
    }
}
