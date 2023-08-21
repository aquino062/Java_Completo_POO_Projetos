import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        double[] vet = new double[n];
        double aux = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextDouble();
            aux += vet[i];
        }

        double media = aux / vet.length;
        System.out.printf("Media do vetor = %.3f\n", media);
        System.out.println("Elementos abaixo da media:");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }

        scanner.close();
    }
}