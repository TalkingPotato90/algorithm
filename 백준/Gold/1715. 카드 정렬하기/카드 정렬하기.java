import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> cards = new PriorityQueue<>();

        for (int i = 0; i < lines; i++) {
            cards.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        int first;
        int second;
        int sum;

        while (cards.size() > 1) {
            first = cards.poll();
            second = cards.poll();

            sum = first + second;

            result += sum;

            cards.add(sum);
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
