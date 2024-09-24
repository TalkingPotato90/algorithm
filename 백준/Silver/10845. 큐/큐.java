import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int lastValue = -1;
        for (int i = 0; i < lines; i++) {
            String s = br.readLine();
            String result = "-1";
            if (s.contains("push")) {
                lastValue = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
                queue.offer(lastValue);
                continue;
            } else if (s.contains("pop")) {
                if (!queue.isEmpty()) {
                    result = Integer.toString(queue.remove());
                }
            } else if (s.contains("size")) {
                result = Integer.toString(queue.size());
            } else if (s.contains("empty")) {
                if (queue.isEmpty()) {
                    result = "1";
                } else {
                    result = "0";
                }
            } else if (s.contains("front")) {
                if (!queue.isEmpty()) {
                    result = Integer.toString(queue.peek());
                }
            } else if (s.contains("back")) {
                if (!queue.isEmpty()) {
                    result = Integer.toString(lastValue);
                }
            }
            bw.write(result+"\n");
            bw.flush();
        }
        bw.close();
    }
}
