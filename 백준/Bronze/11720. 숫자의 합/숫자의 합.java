import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = scanner.nextLine().split("");
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(strings[i]);
        }

        System.out.println(result);
    }
}