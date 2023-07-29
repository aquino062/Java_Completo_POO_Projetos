import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.println("Name: ");
        e1.setName(scanner.nextLine());

        System.out.println("Gross salary: ");
        e1.setGrossSalary(scanner.nextDouble());

        System.out.println("Tax: ");
        e1.setTax(scanner.nextDouble());

        System.out.println(e1);
        System.out.println("Which percentage to increase salary? ");
        e1.increaseSalary(scanner.nextDouble());

        System.out.println("Update data: " + e1);
    }
}