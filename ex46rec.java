
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex46rec {
    public static void main(String[] args) {
        
        int secreto = (int)(Math.random() * 10 + 1);  // número de 1 a 10
int tentativa;
do {
    tentativa = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o número de 1 a 10:"));
    if (tentativa < secreto) {
        JOptionPane.showMessageDialog(null, "Muito baixo!");
    } else if (tentativa > secreto) {
        JOptionPane.showMessageDialog(null, "Muito alto!");
    }
} while (tentativa != secreto);
JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");

    }
}
