import javax.swing.*;

public class ex13rec {
    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog("Digite uma letra:").toLowerCase().charAt(0);
        switch (letra) {
            case 'a':
                JOptionPane.showMessageDialog(null, "Vogal");
                break;
            case 'e':
                JOptionPane.showMessageDialog(null, "Vogal");
                break;
            case 'i':
                JOptionPane.showMessageDialog(null, "Vogal");
                break;
            case 'o':
                JOptionPane.showMessageDialog(null, "Vogal");
                break;
            case 'u':
                JOptionPane.showMessageDialog(null, "Vogal");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Consoante");
        }
    }}
