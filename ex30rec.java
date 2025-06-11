
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex30rec {
public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números de Fibonacci?"));
int a = 0, b = 1;
String seq = a + "\n" + b + "\n";
for (int i = 2; i < n; i++) {
    int c = a + b;
    seq += c + "\n";
    a = b;
    b = c;
}
JOptionPane.showMessageDialog(null, seq);

}
}
