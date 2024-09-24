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
            if (s.contains("push")) {
                lastValue = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
                queue.offer(lastValue);
            } else if (s.contains("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.remove()+"\n");
                }
                bw.flush();
            } else if (s.contains("size")) {
                bw.write(queue.size()+"\n");
                bw.flush();
            } else if (s.contains("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
                bw.flush();
            } else if (s.contains("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peek()+"\n");
                }
                bw.flush();
            } else if (s.contains("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(lastValue+"\n");
                }
                bw.flush();
            }
        }
        bw.close();
    }
}
