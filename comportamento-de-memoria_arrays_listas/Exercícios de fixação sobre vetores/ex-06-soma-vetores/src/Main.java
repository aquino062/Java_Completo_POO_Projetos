import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];


        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = scanner.nextInt();
        }
        //vetor c
        for (int i = 0; i < vetC.length; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("Vetor resultante: ");

        for (int c : vetC) {
            System.out.println(c);
        }

        scanner.close();

    }
}