import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            System.out.println("Dados da " + (i + 1) + " Pessoa: ");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }


        double alturaMedia = 0.0;
        int pessoasMenores16 = 0;

        for (int i = 0; i < vect.length; i++) {
            alturaMedia += vect[i].getAltura();
            if (vect[i].getIdade() < 16) {
                pessoasMenores16++;

            }
        }
        double menor16 = ((double) pessoasMenores16 / vect.length) * 100;

        System.out.printf("Altura média: %.2f\n", (alturaMedia / vect.length));
        System.out.printf("Pessoas com menos de 16 anos: %.1f %%\n", menor16);


        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());

            }
        }
        scanner.close();
    }
}