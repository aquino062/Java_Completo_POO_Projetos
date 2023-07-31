package aplication;

import util.Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = calc.circuference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circuference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calc.PI);
    }


}
