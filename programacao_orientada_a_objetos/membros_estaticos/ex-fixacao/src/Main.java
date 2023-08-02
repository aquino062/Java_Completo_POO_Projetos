import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dolar = scanner.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = scanner.nextDouble();

        double result = CurrencyConverter.converter(dolar, amount);

        System.out.printf("Amount to be paid in reais = %.2f\n" , result);
    }


}