
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex22rec {
    public static void main(String[] args) {
        int soma = 0;
    for (int i = 0; i < 5; i++) {
        
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    soma += num;
}
JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }

}
