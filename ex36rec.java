
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex36rec {
    public static void main(String[] args) {
        int opcao;
    do {
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1 - Opção 1\n2 - Opção 2\n0 - Sair"));
    switch (opcao) {
        case 1: JOptionPane.showMessageDialog(null, "Opção 1 selecionada"); break;
        case 2: JOptionPane.showMessageDialog(null, "Opção 2 selecionada"); break;
        case 0: JOptionPane.showMessageDialog(null, "Saindo..."); break;
        default: JOptionPane.showMessageDialog(null, "Opção inválida");
    }
} while (opcao != 0);

    }

}
