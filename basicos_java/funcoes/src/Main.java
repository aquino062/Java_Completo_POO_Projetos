import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a, b, c);

        imprimir(maior);


    }

    static int max(int a, int b, int c) {
        int aux;

        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }

        return aux;
    }

    static void imprimir(int value) {
        System.out.println("o maior numero é:" + value);
    }


}