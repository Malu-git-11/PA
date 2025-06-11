
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex29rec {
public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
int div = 0;
for (int i = 1; i <= num; i++) {
    if (num % i == 0) div++;
}
String msg = (div == 2) ? "É primo" : "Não é primo";
JOptionPane.showMessageDialog(null, msg);

}
}
