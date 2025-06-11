import java.util.Scanner;

public class ex2rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz2 = new int[2][2];
        System.out.println("Digite os valores da matriz 2x2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz2[i][j] = scanner.nextInt();
        System.out.println("Matriz formatada:");
        for (int[] linha : matriz2) {
            for (int val : linha) System.out.print(val + " ");
            System.out.println();
        }
    }
    }
