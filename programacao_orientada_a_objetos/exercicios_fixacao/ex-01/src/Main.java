import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangle r1 = new Rectangle();

        System.out.println("Enter rectangle width and height:");

        r1.setWidth(scanner.nextDouble());
        r1.setHeight(scanner.nextDouble());

        System.out.println("area = " +  String.format("%.2f",r1.area()));
        System.out.println("Perimeter = " + String.format("%.2f", r1.perimeter()));
        System.out.println("Diagonal = " +  String.format("%.2f",r1.diagonal()));


    }
}