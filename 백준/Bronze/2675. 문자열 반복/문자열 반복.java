import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCase; i++) {
            String[] input = scanner.nextLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String str = input[1];
            System.out.println(repeatString(str,r));
        }

    }

    public static String repeatString(String str, int r) {
        StringBuilder repeatedString = new StringBuilder();

        for (int j = 0; j < str.length(); j++) {
            String temp = str.charAt(j) + "";
            repeatedString.append(temp.repeat(r));
        }

        return repeatedString.toString();
    }
}