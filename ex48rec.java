
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex48rec {
    public static void main(String[] args) {
        int opcao;
do {
    String nome = JOptionPane.showInputDialog("Nome do aluno:");
    double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
    double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
    double media = (n1 + n2) / 2;
    JOptionPane.showMessageDialog(null, nome + " - Média: " + media);
    opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
} while (opcao == JOptionPane.YES_OPTION);

    }
}
