import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        int aux = 0;
        int posicao = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > aux) {
                aux = vet[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor = " + aux);
        System.out.println("posição do maior valor = " + posicao);
        scanner.close();
    }
}