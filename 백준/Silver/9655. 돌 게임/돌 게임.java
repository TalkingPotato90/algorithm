import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int winner = n % 2;

        if (winner == 1) {
            System.out.println("SK");
            return;
        }

        System.out.println("CY");

    }
}