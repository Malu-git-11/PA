import java.util.Scanner;

public class ex3rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pares3 = new int[10];
        for (int i = 0, num = 2; i < 10; i++, num += 2)
            pares3[i] = num;
        System.out.println("Numeros pares de 2 a 20:");
        for (int num : pares3) System.out.print(num + " ");
        System.out.println();
    }

    }
