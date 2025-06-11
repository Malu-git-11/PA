
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex50rec {
    public static void main(String[] args) {
        double saldo = 1000.0;
int opcao;
do {
    opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Bancário:\n1 - Saldo\n2 - Saque\n3 - Depósito\n0 - Sair"));
    switch (opcao) {
        case 1:
            JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + saldo);
            break;
        case 2:
            double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
            if (saque <= saldo) {
                saldo -= saque;
                JOptionPane.showMessageDialog(null, "Saque realizado. Novo saldo: R$ " + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            }
            break;
        case 3:
            double deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
            saldo += deposito;
            JOptionPane.showMessageDialog(null, "Depósito realizado. Novo saldo: R$ " + saldo);
            break;
        case 0:
            JOptionPane.showMessageDialog(null, "Saindo...");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida.");
    }
} while (opcao != 0);

    }

}
