import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}