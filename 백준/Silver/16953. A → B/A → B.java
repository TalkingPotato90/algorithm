import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(bfs(a,b));

    }

    private static long bfs(int a, int b) {
        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{a,1});


        while (!queue.isEmpty()) {
            long[] temp = queue.poll();
            long c = temp[0];
            long count = temp[1];

            if (c == b) {
                return count;
            }

            long next1 = c * 2;
            long next2 = c * 10 + 1;

            if (next1 <= b) {
                queue.offer(new long[] {next1, count + 1});
            }
            if (next2 <= b) {
                queue.offer(new long[] {next2, count + 1});
            }
        }

        return -1;
    }
}