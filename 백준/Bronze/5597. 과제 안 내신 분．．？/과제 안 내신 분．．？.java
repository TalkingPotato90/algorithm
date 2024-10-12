import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> student = new ArrayList<>();

        for (int i = 1; i < 31; i++) {
            student.add(i);
        }

        for (int i = 0; i < 28; i++) {
            student.remove((Integer) scanner.nextInt());
        }

        System.out.println(student.get(0));
        System.out.println(student.get(1));
    }
}