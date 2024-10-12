import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split("");

        for (String word : words) {
            if (word.matches("[A-Z]")) {
                word = word.toLowerCase();
                System.out.print(word);
            }else {
                word = word.toUpperCase();
                System.out.print(word);
            }
        }

    }
}