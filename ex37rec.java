
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex37rec {
    public static void main(String[] args) {
        double soma = 0;
int cont = 0;
double nota;
do {
    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota (0-10):"));
    if (nota >= 0 && nota <= 10) {
        soma += nota;
        cont++;
    }
} while (nota >= 0 && nota <= 10);
double media = (cont > 0) ? soma / cont : 0;
JOptionPane.showMessageDialog(null, "Média: " + media);

    }

}
