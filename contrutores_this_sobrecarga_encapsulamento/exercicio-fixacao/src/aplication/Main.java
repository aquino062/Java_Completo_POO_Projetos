package aplication;

import entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta c1;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Is there na initial deposit (y/n)");
        char resposta = scanner.next().charAt(0);

        if (resposta == 'y') {
            System.out.println("Enter initial deposit value:");
            double deposito = scanner.nextDouble();
            c1 = new Conta(number, name, deposito);

        } else {
            c1 = new Conta(number, name);

        }
        System.out.println(c1);
        System.out.println("Enter a deposit value:");
        c1.deposito(scanner.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(c1);
        System.out.println("Enter a withdraw value:");
        c1.sacar(scanner.nextDouble());
        System.out.println(c1);
        scanner.close();


    }
}