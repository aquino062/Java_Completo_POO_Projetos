import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }

        double avg = 0.0;

        for (int i = 0; i < vect.length; i++) {
            avg += vect[i].getPrice();
        }

        double average = avg / vect.length;

        System.out.printf("Average Price = %.2f\n", average);
        scanner.close();

    }
}