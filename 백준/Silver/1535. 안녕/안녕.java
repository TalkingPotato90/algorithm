import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int person = Integer.parseInt(br.readLine());
        int[][] dp = new int[person][100];

        int[] damage = new int[person];
        int[] joy = new int[person];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < person; i++) {
            damage[i] = Integer.parseInt(st.nextToken());
            joy[i] = Integer.parseInt(st1.nextToken());
        }

        for (int h = 0; h < 100; h++) {
            if (damage[0] <= h) {
                dp[0][h] = joy[0];
            }
        }

        for (int d = 1; d < person; d++) {
            for (int h = 0; h < 100; h++) {
                if (damage[d] > h) {
                    dp[d][h] = dp[d - 1][h];
                } else {
                    dp[d][h] = Math.max(dp[d - 1][h], joy[d] + dp[d - 1][h - damage[d]]);
                }
            }
        }
        System.out.println(dp[person - 1][99]);
    }
}