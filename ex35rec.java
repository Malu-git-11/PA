
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex35rec {
    public static void main(String[] args) {
        int soma = 0, cont = 0;
int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (-1 para sair):"));
while (idade != -1) {
    soma += idade;
    cont++;
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (-1 para sair):"));
}
double media = (cont > 0) ? (double)soma / cont : 0;
JOptionPane.showMessageDialog(null, "Média das idades: " + media);

    }

}
