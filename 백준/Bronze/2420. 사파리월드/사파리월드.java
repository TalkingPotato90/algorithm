import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        
        long result = Math.abs(n-m);

        System.out.println(result);
    }
}