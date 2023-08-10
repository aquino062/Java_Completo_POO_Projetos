import entidades.Locador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Locador[] quartos = new Locador[10];

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();//consumir quebra de linha acima
            System.out.println("Rent " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.next();


            System.out.print("Room: ");
            int room = scanner.nextInt();

            quartos[room] = new Locador(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }
        scanner.close();

    }
}