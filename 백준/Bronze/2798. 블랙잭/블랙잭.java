import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] cards = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i ++){
            cards[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    int cur = cards[i] + cards[j] + cards[k];
                    
                    if(cur <= m && cur > max){
                        max = cur;
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}