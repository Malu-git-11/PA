import javax.swing.*;

public class ex16rec {
    public static void main(String[] args){
        String produto = JOptionPane.showInputDialog("Digite o nome do produto:").toLowerCase();
        switch (produto) {
            case "maçã", "banana", "uva" -> JOptionPane.showMessageDialog(null, "Categoria: Fruta");
            case "cenoura", "batata" -> JOptionPane.showMessageDialog(null, "Categoria: Legume");
            case "leite", "queijo" -> JOptionPane.showMessageDialog(null, "Categoria: Laticínio");
            default -> JOptionPane.showMessageDialog(null, "Categoria desconhecida.");
        }
    }
}
