import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("Numeros pares: ");
        int qntPares = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                qntPares++;
            }
        }
        System.out.println("\nQuantidade de pares = " + qntPares);
        scanner.close();
    }
}