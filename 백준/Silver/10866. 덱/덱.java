import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < lines; i++) {
            String command = br.readLine();
            String result = "-1";

            if (command.contains("push_front")) {
                deque.offerFirst(Integer.parseInt(command.split(" ")[1]));
                continue;
            } else if (command.contains("push_back")) {
                deque.offerLast(Integer.parseInt(command.split(" ")[1]));
                continue;
            } else if (command.contains("pop_front")) {
                if (!deque.isEmpty()) {
                    result = Integer.toString(deque.pollFirst());
                }
            } else if (command.contains("pop_back")) {
                if (!deque.isEmpty()) {
                    result = Integer.toString(deque.pollLast());
                }
            } else if (command.contains("size")) {
                result = Integer.toString(deque.size());
            } else if (command.contains("empty")) {
                if (deque.isEmpty()) {
                    result = "1";
                }else{
                    result = "0";
                }
            } else if (command.equals("front")) {
                if (!deque.isEmpty()) {
                    result = Integer.toString(deque.peekFirst());
                }
            } else if (command.equals("back")) {
                if (!deque.isEmpty()) {
                    result = Integer.toString(deque.peekLast());
                }
            }

            bw.write(result+"\n");
            bw.flush();
        }
        bw.close();
    }
}