
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex24rec {
    public static void main(String[] args) {
        String nomes = "";
for (int i = 0; i < 10; i++) {
    nomes += JOptionPane.showInputDialog("Digite o nome " + (i+1)) + "\n";
}

JOptionPane.showMessageDialog(null, nomes);

    }

}
