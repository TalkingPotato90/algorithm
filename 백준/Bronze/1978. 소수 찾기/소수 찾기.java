import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            int count = 0;
            for(int j = 2; j <= a; j++){
                if(a % j == 0){
                    count++;
                }
            }
            if(count == 1){
                result++;
            }
        }
        
        System.out.println(result);
    }
}