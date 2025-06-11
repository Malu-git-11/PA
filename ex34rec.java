
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex34rec {
    public static void main(String[] args) {
        int soma = 0, cont = 0;
int num;
do {
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo:"));
    if (num >= 0) {
        soma += num;
        cont++;
    }
} while (num >= 0);
double media = (cont > 0) ? (double)soma/cont : 0;
JOptionPane.showMessageDialog(null, "Média: " + media);

        
    }

}
