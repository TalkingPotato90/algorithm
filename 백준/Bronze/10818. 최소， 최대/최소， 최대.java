import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int init = scanner.nextInt();
        int max = init;
        int min = init;

        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }else if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}