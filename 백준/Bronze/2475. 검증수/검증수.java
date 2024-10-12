import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += square(scanner.nextInt());
        }
        result = result % 10;
        System.out.println(result);
    }

    private static int square(int number) {
        return number * number;
    }
}