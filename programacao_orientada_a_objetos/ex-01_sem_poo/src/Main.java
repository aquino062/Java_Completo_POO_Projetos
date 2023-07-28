import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xa, xb, xc, ya, yb, yc;


        System.out.println("Enter the measures of triangle x:");
        xa = scanner.nextDouble();
        xb = scanner.nextDouble();
        xc = scanner.nextDouble();

        System.out.println("Enter the measures of triangle y:");

        ya = scanner.nextDouble();
        yb = scanner.nextDouble();
        yc = scanner.nextDouble();


        double p = (xa + xb + xc) / 2;
        double areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc) / 2;
        double areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        System.out.printf("Triangle x area: %.4f\n", areax);
        System.out.printf("Triangle y area: %.4f\n", areay);

        if (areax > areay) {
            System.out.println("Larger area: x");
        } else {
            System.out.println("Larger area: Y");

        }
        scanner.close();

    }
}