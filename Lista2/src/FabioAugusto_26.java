import javax.swing.*;

public class FabioAugusto_26 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double salarioBase = new Double(JOptionPane.showInputDialog("Informe o salário base: "));
        int tempo = new Integer(JOptionPane.showInputDialog("Informe o tempo de serviço: "));

        if (salarioBase > 0 && tempo > 0) {
            double imposto = 0;
            double gratificacao = 0;
            double salarioLiquido = 0;
            String classificacao = "";

            //Calculando imposto
            if (salarioBase < 200) {
                imposto = 0;
            } else if (salarioBase >= 200 && salarioBase <= 450) {
                imposto = salarioBase * 0.03;
            } else if (salarioBase > 450 && salarioBase < 700) {
                imposto = salarioBase * 0.08;
            } else {
                imposto = salarioBase * 0.12;
            }

            //Calculando gratificação
            if (salarioBase > 500) {
                if (tempo <= 3) {
                    gratificacao = 20;
                } else {
                    gratificacao = 30;
                }
            } else {
                if (tempo <= 3) {
                    gratificacao = 23;
                } else if (tempo > 3 && tempo < 6) {
                    gratificacao = 35;
                } else {
                    gratificacao = 33;
                }
            }

            //Calculando salário líquido
            salarioLiquido = salarioBase - imposto + gratificacao;

            //Calculando classificação
            if (salarioLiquido <= 350) {
                classificacao = "A";
            } else if (salarioLiquido > 350 && salarioLiquido < 600) {
                classificacao = "B";
            } else {
                classificacao = "C";
            }

            //Mostrando resultado
            JOptionPane.showMessageDialog(null, "O imposto é: " + imposto +
                    "\nGratificação: " + gratificacao +
                    "\nSalário líquido: " + salarioLiquido +
                    "\nClassificação: " + classificacao);
        } else {
            JOptionPane.showMessageDialog(null, "Valores informados inválidos");
        }
    }
}
