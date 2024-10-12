import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}