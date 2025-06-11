import java.util.Scanner;

public class ex9rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz9 = new int[5][5];
        int maior = Integer.MIN_VALUE, linhaMaior = 0, colunaMaior = 0;
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                matriz9[i][j] = scanner.nextInt();
                if (matriz9[i][j] > maior) {
                    maior = matriz9[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        System.out.println("Maior valor: " + maior + " na posicao [" + linhaMaior + "][" + colunaMaior + "]");
    }
}
