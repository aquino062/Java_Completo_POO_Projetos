import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] vet = new double[n];


        for (int i = 0; i < n; i++) {
            vet[i]=scanner.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < vet.length ; i++) {
            soma += vet[i];
        }
        System.out.printf("Average height = %.2f\n", (soma / n));

        scanner.close();
    }
}