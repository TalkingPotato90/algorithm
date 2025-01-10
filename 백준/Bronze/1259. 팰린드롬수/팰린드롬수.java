import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = br.readLine();
            if(input.equals("0")){
                break;
            }
            StringBuffer sb = new StringBuffer(input);
            String reverse = sb.reverse().toString();
            
            if(input.equals(reverse)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}