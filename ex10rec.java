import java.util.Scanner;

public class ex10rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz10 = new int[3][3];
        boolean simetrica = true;
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz10[i][j] = scanner.nextInt();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matriz10[i][j] != matriz10[j][i]) simetrica = false;
        System.out.println("A matriz é simétrica? " + (simetrica ? "Sim" : "Não"));
    }
}
