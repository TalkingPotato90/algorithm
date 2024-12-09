import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < 10; i++){
            int input = Integer.parseInt(br.readLine());
            int value = input % 42;
            
            set.add(value);
        }
        
        System.out.println(set.size());
    }
}