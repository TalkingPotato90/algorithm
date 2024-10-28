import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        LocalTime time = LocalTime.of(h, m);
        LocalTime newTime = time.minusMinutes(45);

        String resultHour = newTime.toString().substring(0, 2);
        String resultMinute = newTime.toString().substring(3);

        if (resultHour.startsWith("0")) {
            resultHour = resultHour.substring(1);
        }
        if (resultMinute.startsWith("0")) {
            resultMinute = resultMinute.substring(1);
        }

        System.out.println(resultHour + " " + resultMinute);
    }
}
