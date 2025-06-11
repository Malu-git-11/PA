import java.util.Scanner;

public class ex8rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz8 = new int[4][4];
        int contPares = 0;
        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                matriz8[i][j] = scanner.nextInt();
                if (matriz8[i][j] % 2 == 0) contPares++;
            }
        System.out.println("Quantidade de pares: " + contPares);
    }
}
