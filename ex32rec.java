
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex32rec {
    public static void main(String[] args) {
        int i = 1;
String resultado = "";
while (i <= 20) {
    resultado += i + "\n";
    i++;
}
JOptionPane.showMessageDialog(null, resultado);

    }

}
