import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] sum = new int[testCase];
        
        for(int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int human = Integer.parseInt(st.nextToken());
            int time = 0;
            for(int j = 0; j < human; j++){
                time += Integer.parseInt(st.nextToken());
            }
            sum[i] = time;
        }
        
        Arrays.sort(sum);
        int total = 0;
        int[] prefixSum = new int[testCase];
        
        for(int i = 0; i < testCase; i++){
            total += total + sum[i];
            prefixSum[i] = total;
        }
        
        System.out.println(prefixSum[testCase-1]);
    }
}