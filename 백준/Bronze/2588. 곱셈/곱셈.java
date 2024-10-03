import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int base = Integer.parseInt(br.readLine());
        int base2 = Integer.parseInt(br.readLine());
        
        int a = base2 % 10;
        int b = (base2 % 100 - a) / 10;
        int c = (base2 % 1000 - b * 10 - a) / 100;
        
        bw.write(base * a + "\n");
        bw.write(base * b + "\n");
        bw.write(base * c + "\n");
        bw.write(base * base2 + "\n");
        bw.flush();
        bw.close();
    }
}