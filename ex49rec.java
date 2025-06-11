
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex49rec {
    public static void main(String[] args) {
        String login, senha;
int tentativas = 0;
boolean autenticado = false;
do {
    login = JOptionPane.showInputDialog("Login:");
    senha = JOptionPane.showInputDialog("Senha:");
    tentativas++;
    if (login.equals("admin") && senha.equals("1234")) {
        autenticado = true;
    } else {
        JOptionPane.showMessageDialog(null, "Login ou senha inválidos");
    }
} while (!autenticado && tentativas < 3);

if (autenticado) {
    JOptionPane.showMessageDialog(null, "Bem-vindo!");
} else {
    JOptionPane.showMessageDialog(null, "Acesso negado");
}

    }

}
