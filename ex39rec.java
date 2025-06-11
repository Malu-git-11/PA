
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex39rec {
    public static void main(String[] args) {
        String login, senha;
do {
    login = JOptionPane.showInputDialog("Login:");
    senha = JOptionPane.showInputDialog("Senha:");
} while (!login.equals("admin") || !senha.equals("1234"));
JOptionPane.showMessageDialog(null, "Acesso liberado!");

    }

}
