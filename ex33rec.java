import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex33rec {
    public static void main(String[] args) {
        String senha;
do {
    senha = JOptionPane.showInputDialog("Digite a senha:");
} while (!senha.equals("1234"));
JOptionPane.showMessageDialog(null, "Acesso permitido!");

    }

}
