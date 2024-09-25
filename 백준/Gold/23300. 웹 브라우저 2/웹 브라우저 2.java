import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> frontwardDeque = new ArrayDeque<>();
        Deque<String> backwardDeque = new ArrayDeque<>();
        String recentPage = null;

        String[] settings = br.readLine().split(" ");

        int lines = Integer.parseInt(settings[1]);

        for (int i = 0; i < lines; i++) {
            String[] command = br.readLine().split(" ");

            if (command[0].equals("B") && !backwardDeque.isEmpty()) {
                frontwardDeque.offerFirst(recentPage);
                recentPage = backwardDeque.pollLast();
            } else if (command[0].equals("F") && !frontwardDeque.isEmpty()) {
                backwardDeque.offerLast(recentPage);
                recentPage = frontwardDeque.pollFirst();
            } else if (command[0].equals("A")) {
                frontwardDeque.clear();

                if (recentPage != null) {
                    backwardDeque.offerLast(recentPage);
                }

                recentPage = command[1];
            } else if (command[0].equals("C")) {
                if (!backwardDeque.isEmpty()) {
                    Deque<String> compressedBackwardDeque = new ArrayDeque<>();
                    Iterator<String> iterator = backwardDeque.iterator();
                    String prev = iterator.next();
                    compressedBackwardDeque.offerLast(prev);

                    while (iterator.hasNext()) {
                        String current = iterator.next();
                        if (!current.equals(prev)) {
                            compressedBackwardDeque.offerLast(current);
                        }
                        prev = current;
                    }

                    backwardDeque.clear();
                    backwardDeque.addAll(compressedBackwardDeque);
                }
            }
        }

        StringBuilder backward = new StringBuilder();
        StringBuilder frontward = new StringBuilder();

        if (backwardDeque.isEmpty()) {
            backward.append("-1");
        }

        if (frontwardDeque.isEmpty()) {
            frontward.append("-1");
        }

        while (!backwardDeque.isEmpty()) {
            backward.append(backwardDeque.pollLast()).append(" ");
        }

        if (backward.length() > 0 && backward.charAt(backward.length() - 1) == ' ') {
            backward.setLength(backward.length() - 1);
        }

        while (!frontwardDeque.isEmpty()) {
            frontward.append(frontwardDeque.pollFirst()).append(" ");
        }

        if (frontward.length() > 0 && frontward.charAt(frontward.length() - 1) == ' ') {
            frontward.setLength(frontward.length() - 1);
        }

        bw.write(recentPage + "\n");
        bw.write(backward + "\n");
        bw.write(frontward + "\n");
        bw.flush();
        bw.close();
    }
}