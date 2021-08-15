import javax.swing.*;
import java.util.Date;

public class FabioAugusto_15 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String data1 = (JOptionPane.showInputDialog("Digite a primeira data"));
        String data2 = (JOptionPane.showInputDialog("Digite a segunda data"));
        Date d1 = new Date(data1);
        Date d2 = new Date(data2);
        if (d1.after(d2)) {
            JOptionPane.showMessageDialog(null, "A maior data é: " + data1);
        } else {
            JOptionPane.showMessageDialog(null, "A maior data é: " + data2);
        }
    }
}
