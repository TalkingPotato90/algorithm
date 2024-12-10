import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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
        int same = 1;

        for(int i = 0; i < n; i++){
            sum += visitors[i];
            if(i >= x - 1){
                if(max <= sum){
                    if(max == sum){
                        same++;
                    }else{
                        same = 1;
                        max = sum;
                    }
                }
                sum -= visitors[i - x + 1];
            }
        }

        System.out.println(max);
        System.out.println(same);
    }
}