
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex38rec {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para contagem regressiva:"));
String resultado = "";
while (num >= 0) {
    resultado += num + "\n";
    num--;
}
JOptionPane.showMessageDialog(null, resultado);

    }

}
