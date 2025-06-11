
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex42rec {
public static void main(String[] args) {
    int cont = 0;
int num;
do {
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    if (num >= 0) cont++;
} while (num >= 0);
JOptionPane.showMessageDialog(null, "Quantidade de números positivos: " + cont);

}
}
