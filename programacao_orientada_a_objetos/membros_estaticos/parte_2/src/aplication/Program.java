package aplication;

import util.Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circuference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circuference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", Calculator.PI);
    }


}
