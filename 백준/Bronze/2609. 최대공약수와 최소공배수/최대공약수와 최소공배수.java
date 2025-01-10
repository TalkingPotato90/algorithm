import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int gcdNum = 0;
        int lcmNum = a * b;
        
        if( a > b){
            gcdNum = gcd(a, b);
        }else{
            gcdNum = gcd(b, a);
        }
        
        lcmNum /= gcdNum;
        
        System.out.println(gcdNum);
        System.out.println(lcmNum);
    }
    
    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    
}