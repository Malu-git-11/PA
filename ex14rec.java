import javax.swing.*;

public class ex14rec {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12:"));

        String nomeMes;
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Marco");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Abriu");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Dezembro");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcao Invalida");
        }

    }
}
