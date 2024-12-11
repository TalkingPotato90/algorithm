import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] money = new int[n];
        long sum = 0L;
        long max = 0L;
        
        for(int i = 0; i < n; i++){
            money[i] = Integer.parseInt(st.nextToken());
            sum += money[i];
            
            if(i >= m){
                sum -= money[i - m];
            }
            
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}