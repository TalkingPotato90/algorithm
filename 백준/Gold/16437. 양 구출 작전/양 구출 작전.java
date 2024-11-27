import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int island = Integer.parseInt(br.readLine());

        Map<Integer, List<Integer>> map = new HashMap<>();
        long[] counts = new long[island + 1];
        boolean[] isWolf = new boolean[island + 1];
        int[] parent = new int[island + 1];
        Arrays.fill(parent, -1);

        for (int i = 1; i <= island; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 2; i <= island; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            long count = Long.parseLong(st.nextToken());
            int connect = Integer.parseInt(st.nextToken());

            isWolf[i] = type.equals("W");
            counts[i] = count;

            map.get(connect).add(i);
            parent[i] = connect;
        }

        System.out.println(dfs(1,map,counts,isWolf));

    }

    private static long dfs(int node, Map<Integer, List<Integer>> graph, long[] animalCount, boolean[] isWolf) {
        long totalSheep = 0;

        for (int child : graph.get(node)) {
            totalSheep += dfs(child, graph, animalCount, isWolf);
        }

        if (isWolf[node]) {
            totalSheep = Math.max(0, totalSheep - animalCount[node]);
        } else {
            totalSheep += animalCount[node];
        }

        return totalSheep;
    }
}