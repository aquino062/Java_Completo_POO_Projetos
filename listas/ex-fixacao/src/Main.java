import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("id: ");
            int id = scanner.nextInt();
            while (temId(list, id)) {
                System.out.println("Esse id já existe! tente novamente: ");
                id = scanner.nextInt();
            }

            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            list.add(new Funcionario(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idAumento = scanner.nextInt();

        double percentage = 0.0;

        Funcionario fun = list.stream().filter(funcionario -> funcionario.getId() == idAumento).findFirst().orElse(null);


        if (fun == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            percentage = scanner.nextDouble();
            fun.aumentosalario(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");

        for (Funcionario x : list) {
            System.out.println(x);
        }
        scanner.close();
    }

    public static boolean temId(List<Funcionario> list, int id) {
        Funcionario fun = list.stream().filter(funcionario -> funcionario.getId() == id).findFirst().orElse(null);
        return fun != null;
    }
}