import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex1rec {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite um número inteiro: ");
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("Valores do vetor:");
        for (int num : vetor1) System.out.print(num + " ");
        System.out.println();

    }
}