import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex26rec {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
String tabuada = "";
for (int i = 1; i <= 10; i++) {
    tabuada += n + " x " + i + " = " + (n*i) + "\n";
}
JOptionPane.showMessageDialog(null, tabuada);

    }

}
