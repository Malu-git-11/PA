import javax.swing.*;

public class ex20rec {
    public static void main(String[] args){
        int[] votos = new int[3]; // Candidato 1, 2, 3
        int voto;
        do {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Vote:\n1 - Candidato A\n2 - Candidato B\n3 - Candidato C\n0 - Fim"));
            if (voto >= 1 && voto <= 3)
                votos[voto - 1]++;
        } while (voto != 0);
        JOptionPane.showMessageDialog(null,"Resultado da votação:\n" + "Candidato A: " + votos[0] + "\nCandidato B: " + votos[1] + "\nCandidato C: " + votos[2]);
    }
}

