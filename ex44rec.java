
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author malum
 */
public class ex44rec {
public static void main(String[] args) {
    String nome;
String todos = "";
do {
    nome = JOptionPane.showInputDialog("Digite um nome (ou 'fim' para encerrar):");
    if (!nome.equalsIgnoreCase("fim")) {
        todos += nome + "\n";
    }
} while (!nome.equalsIgnoreCase("fim"));
JOptionPane.showMessageDialog(null, "Nomes digitados:\n" + todos);


 }
}
