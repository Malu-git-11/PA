
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex31rec {
    public static void main(String[] args) {
        int soma = 0;
int num;
do {
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (0 para sair):"));
    soma += num;
} while (num != 0);
JOptionPane.showMessageDialog(null, "Soma: " + soma);

    }

}
