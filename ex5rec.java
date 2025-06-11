import java.util.Scanner;

public class ex5rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas5 = new double[10];
        double soma5 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas5[i] = scanner.nextDouble();
            soma5 += notas5[i];
        }
        System.out.println("Media das notas: " + (soma5 / 10));
    }
}
