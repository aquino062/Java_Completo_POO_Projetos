import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int x = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.print("Position ");
                    System.out.println(i + "," + j + ":");
                    if (j > 0) {
                        System.out.print("Left: ");
                        System.out.println(mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.print("Up: ");
                        System.out.println(mat[i - 1][j]);
                    }
                    if (j < n - 1) {
                        System.out.print("Right: ");
                        System.out.println(mat[i][j + 1]);
                    }
                    if (i < m - 1) {
                        System.out.print("Down: ");
                        System.out.println(mat[i + 1][j]);
                    }


                }
            }
        }
    }
}