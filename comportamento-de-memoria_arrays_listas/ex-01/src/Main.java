import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um número: ");
            vet[i] = scanner.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] <= 0) {
                System.out.println(vet[i]);
            }
        }
        scanner.close();


    }
}