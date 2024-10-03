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
        
        Long a = Long.parseLong(numbers[0]);
        Long b = Long.parseLong(numbers[1]);
        Long c = Long.parseLong(numbers[2]);
       
        bw.write(a + b + c + "\n");
        bw.flush();
        bw.close();
    }
}