
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex47rec {
    public static void main(String[] args) {
        String senha;
int tentativas = 0;
boolean acesso = false;
do {
    senha = JOptionPane.showInputDialog("Digite a senha:");
    tentativas++;
    if (senha.equals("1234")) {
        acesso = true;
    } else {
        JOptionPane.showMessageDialog(null, "Senha incorreta");
    }
} while (!acesso && tentativas < 3);

if (acesso) {
    JOptionPane.showMessageDialog(null, "Acesso permitido");
} else {
    JOptionPane.showMessageDialog(null, "Acesso bloqueado");
}

    }
}
