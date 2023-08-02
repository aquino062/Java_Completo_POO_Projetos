import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        int qnt = scanner.nextInt();

        Product p1 = new Product(name, price, qnt);

        p1.imprimirInfo();
        System.out.print("Enter the number of products to be added in stock: ");
        qnt = scanner.nextInt();
        p1.addProducts(qnt);
        p1.imprimirInfo();
        System.out.print("Enter the number of products to be removed from stock: ");
        qnt = scanner.nextInt();
        p1.removerProducts(qnt);
        p1.imprimirInfo();

        System.out.println(p1);


    }
}