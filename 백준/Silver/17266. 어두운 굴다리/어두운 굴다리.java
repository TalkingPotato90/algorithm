import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] pos = new int[M];
        for (int i = 0; i < M; i++) {
            pos[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        if (M > 1){
            int first = pos[0];
            if(pos[0] == 0){
                first = 0;
            }
            int last = N - pos[M-1];

            max = Math.max(first, last);
        }

        for (int i = M-1; i > 0; i--) {
            int distance = pos[i] - pos[i-1];

            if(distance / 2 >= max && distance % 2 == 0) {
                max = distance / 2;
            }else if(distance / 2 >= max && distance % 2 == 1){
                max = (distance / 2) + 1;
            }
        }

        if(max == 0) {
            max = N;
        }

        System.out.println(max);
    }
}