import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mushroom = new int[10];
        int sum = 0;
        int[] total = new int[10];
        
        for(int i = 0; i < 10; i++){
            mushroom[i] = Integer.parseInt(br.readLine());
            sum += mushroom[i];
            total[i] = sum;
        }
        
        int small = 0;
        int large = 0;
        
        for(int i = 0; i < 10; i++){
            if(total[i] > 100){
                large = total[i];
                small = total[i-1];
                break;
            }
            large = total[i];
        }
        
        int smallDif = Math.abs(100-small);
        int largeDif = Math.abs(100-large);
        
        int result = smallDif < largeDif ? small : large;
        
        System.out.println(result);
    }
}