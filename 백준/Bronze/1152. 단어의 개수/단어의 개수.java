import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine().strip();
        
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        
        String[] input = s.split(" ");
        
        System.out.println(input.length);
    }
}