
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex25rec {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
for (int i = 0; i < 10; i++) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    if (num > maior) maior = num;
}
JOptionPane.showMessageDialog(null, "Maior número: " + maior);
    }

}
