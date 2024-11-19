import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String empty = "0".repeat(K);
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (!s.contains(empty)) {
                continue;
            }

            for(int j = 0; j <= M - K; j++) {
                if(s.substring(j, j + K).equals(empty)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}