import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        long[] sum = new long[testCase];
        
        for(int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int human = Integer.parseInt(st.nextToken());
            long time = 0L;
            for(int j = 0; j < human; j++){
                time += Long.parseLong(st.nextToken());
            }
            sum[i] = time;
        }
        
        Arrays.sort(sum);
        long total = 0;
        long[] prefixSum = new long[testCase];
        
        for(int i = 0; i < testCase; i++){
            total += sum[i];
            prefixSum[i] = total;
        }
        
        int result = 0;
        
        for(int i = 0; i < testCase; i++){
            result += prefixSum[i];
        }

        System.out.println(result);
    }
}