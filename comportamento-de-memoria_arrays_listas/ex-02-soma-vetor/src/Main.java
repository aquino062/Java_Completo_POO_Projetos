import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero ");
            vet[i] = scanner.nextInt();
        }

        double soma = 0.0;
        System.out.print("valores = ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            soma += vet[i];
        }

        System.out.println();
        System.out.printf("soma = %.2f\n", soma);
        System.out.printf("media = %.2f\n", (soma / vet.length));
        scanner.close();

    }

}