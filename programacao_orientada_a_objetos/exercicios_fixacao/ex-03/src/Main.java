import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        a1.setName(scanner.nextLine());

        System.out.println("Digite a nota 1:");
        a1.setN1(scanner.nextDouble());
        System.out.println("Digite a nota 2: ");
        a1.setN2(scanner.nextDouble());
        System.out.println("Digite a nota 3: ");
        a1.setN3(scanner.nextDouble());

        a1.calcularNota();

    }
}