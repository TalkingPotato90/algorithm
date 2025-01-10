import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        float[] arr = new float[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++){
            arr[i] = Float.parseFloat(st.nextToken());
        }
        
        Arrays.sort(arr);
        float max = arr[n-1];
        float total = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] / max * 100;
            total += arr[i];
        }
        
        float avg = total / n;
        
        System.out.println(avg);
    }
}