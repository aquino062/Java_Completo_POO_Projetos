import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = scanner.nextInt();

        int[] vet = new int[n];
        int soma = 0, cont = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                cont++;
            }
        }


        if (soma == 0) {
            System.out.println("Nenhum numero par");
        } else {
            double media = (double) soma / cont;
            System.out.printf("Media dos pares é %.1f\n", media);
        }
        scanner.close();
    }

}