import java.util.Scanner;

public class ex6rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz6 = new int[3][3];
        int contMaior10 = 0;
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                matriz6[i][j] = scanner.nextInt();
                if (matriz6[i][j] > 10) contMaior10++;
            }
        System.out.println("Valores maiores que 10: " + contMaior10);
    }
}
