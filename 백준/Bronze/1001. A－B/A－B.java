import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] numbers = br.readLine().split(" ");
        
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        
        int result = a - b;
        
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}