import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= i+1;
        }
        System.out.println(result);
    }
}