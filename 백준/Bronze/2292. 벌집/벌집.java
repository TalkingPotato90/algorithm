import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n == 1){
            System.out.println(1);
            return;
        }
        
        int result = 1;
        int max = 1;
        
        while(n > max){
            result++;
            max = 1 + 3 * result * (result - 1);
        }
        
        System.out.println(result);
    }
}