import java.io.*;
import java.util.*;

public class Main{
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] visitors = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int validSum = 0;

        for(int i : visitors){
            validSum += i;
        }

        if(validSum == 0){
            System.out.println("SAD");
            return;
        }

        int sum = 0;
        int max = 0;
        int cnt = 0;
        int same = 0;

        for(int i = 0; i < n; i++){
            sum += visitors[i];
            cnt++;
            if(cnt >= x){
                if(max < sum){
                    max = sum;
                }
                sum -= visitors[i - x + 1];
            }
        }

        sum = 0;
        cnt = 0;

        for(int i = 0; i < n; i++){
            sum += visitors[i];
            cnt++;
            if(cnt >= x){
                if(max == sum){
                    same++;
                }
                sum -= visitors[i - x + 1];
            }
        }

        System.out.println(max);
        System.out.println(same);
    }
}