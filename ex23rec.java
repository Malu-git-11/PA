
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex23rec {
    public static void main(String[] args) {
        int cont = 0;
for (int i = 1; i <= 50; i++) {
    if (i % 2 == 0) cont++;
}
    JOptionPane.showMessageDialog(null, "Quantidade de pares: " + cont);
    }

}
