import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            long tpX = scanner.nextInt();
            long tpY = scanner.nextInt();
            long ecX = scanner.nextInt();
            long ecY = scanner.nextInt();

            long ec = ecX * ecY;
            long tp = tpX * tpY;

            if (ec > tp) {
                System.out.println("Eurecom");
            }else if (ec < tp) {
                System.out.println("TelecomParisTech");
            }else {
                System.out.println("Tie");
            }
        }
    }
}