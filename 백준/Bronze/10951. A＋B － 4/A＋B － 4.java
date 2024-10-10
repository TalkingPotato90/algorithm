import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}