import javax.swing.*;

public class FabioAugusto_7 {
    public static void main(String[] args) {
        String caracter = JOptionPane.showInputDialog("Informe um caracter:");
        String comparacao = caracter.toLowerCase();
        if (comparacao == "a" || comparacao == "e" || comparacao == "i" || comparacao == "o" || comparacao == "u") {
            JOptionPane.showMessageDialog(null, "É uma vogal ! ! !");
        } else {
            JOptionPane.showMessageDialog(null, "Não é uma vogal ! ! !");
        }
    }
}
