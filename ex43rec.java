
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex43rec {
public static void main(String[] args) {
    int opcao;
do {
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1 - Cadastro\n2 - Listagem\n3 - Edição\n0 - Sair"));
    switch (opcao) {
        case 1: JOptionPane.showMessageDialog(null, "Cadastrando..."); break;
        case 2: JOptionPane.showMessageDialog(null, "Listando..."); break;
        case 3: JOptionPane.showMessageDialog(null, "Editando..."); break;
        case 0: JOptionPane.showMessageDialog(null, "Saindo..."); break;
        default: JOptionPane.showMessageDialog(null, "Opção inválida");
    }
} while (opcao != 0);


}
}
