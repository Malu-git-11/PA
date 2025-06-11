import javax.swing.*;

public class ex11rec {
    public static void main(String[] args){
        String num = JOptionPane.showInputDialog("Digete um numero de 1 a 3:");

        switch (num) {
            case "1":
                JOptionPane.showMessageDialog(null, "Fruta");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Verdura");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Massa");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}
