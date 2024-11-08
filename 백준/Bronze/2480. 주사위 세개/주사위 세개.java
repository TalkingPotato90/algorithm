import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int count = 0;
        int same = 0;

        if(a == b){
            count++;
            same = a;
        }
        
        if(a == c){
            count++;
            same = a;
        }
        
        if(b == c){
            count++;
            same = b;
        }
        
        int prize = 0;
        
        if(count >= 2){
            prize = (1000 * same) + 10000;
        }
        
        if (count == 1){
            prize = (100 * same) + 1000;
        }
        
        if (count == 0){
            int max = Math.max(a,Math.max(b,c));
            prize = max * 100;
        }
        
        System.out.println(prize);
    }
}