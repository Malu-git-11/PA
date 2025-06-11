
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex28rec {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
int fat = 1;
for (int i = num; i >= 1; i--) {
    fat *= i;
}
    JOptionPane.showMessageDialog(null, "Fatorial: " + fat);

    }

}
