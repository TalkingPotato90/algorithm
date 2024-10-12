import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrixA = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixB = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixC = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}