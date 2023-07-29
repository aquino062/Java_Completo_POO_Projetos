import entidades.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();


        System.out.println("Enter the measures of triangle x:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle y:");

        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double areax = x.calcularArea();
        double areay = y.calcularArea();

        System.out.printf("Triangle x area: %.4f\n", areax);
        System.out.printf("Triangle y area: %.4f\n", areay);

        if (areax > areay) {
            System.out.println("Larger area: x");
        } else {
            System.out.println("Larger area: Y");

        }
        scanner.close();

    }
}