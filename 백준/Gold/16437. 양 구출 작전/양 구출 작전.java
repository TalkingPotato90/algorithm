import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int island = Integer.parseInt(br.readLine());
        List<Integer>[] graph = new ArrayList[island + 1];
        for (int i = 1; i <= island; i++) {
            graph[i] = new ArrayList<>();
        }

        long[] counts = new long[island + 1];

        for (int i = 2; i <= island; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            long count = Long.parseLong(st.nextToken());
            int connect = Integer.parseInt(st.nextToken());

            counts[i] = type.equals("W") ? -count : count;
            graph[connect].add(i);
        }

        sb.append(dfs(1, graph, counts)).append("\n");
        System.out.print(sb);
    }

    private static long dfs(int node, List<Integer>[] graph, long[] animalCount) {
        long totalSheep = 0;
        for (int child : graph[node]) {
            totalSheep += dfs(child, graph, animalCount);
        }
        totalSheep += animalCount[node];
        return Math.max(0, totalSheep);
    }
}