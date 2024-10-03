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
        
        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        
        double result = a / b;
        
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}