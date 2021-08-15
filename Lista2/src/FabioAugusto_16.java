import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class FabioAugusto_16 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        Date dataNascimento = formatoData.parse(JOptionPane.showInputDialog("Digite a data de nascimento: "));
        Date dataVotacao = formatoData.parse(JOptionPane.showInputDialog("Digite a data para voto: "));

        long diferenca = (TimeUnit.DAYS.convert((dataVotacao.getTime() - dataNascimento.getTime()), TimeUnit.MILLISECONDS)) / 360;

        if (diferenca < 16) {
            JOptionPane.showMessageDialog(null, "Não vota!");
        } else if ((diferenca >= 16 && diferenca < 18) || diferenca > 70) {
            JOptionPane.showMessageDialog(null, "Facultativo!");
        } else if (diferenca >= 18 && diferenca <= 70) {
            JOptionPane.showMessageDialog(null, "Obrigatório!");
        }
    }
}
