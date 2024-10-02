import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        String dump;

        for (int i = 0; i < testCase; i++) {
            String[] arr = br.readLine().split(" ");
            int country = Integer.parseInt(arr[0]);
            int aircraft = Integer.parseInt(arr[1]);

            bw.write(country-1+"\n");

            for (int j = 0; j < aircraft; j++) {
                dump = br.readLine();
            }
            
            bw.flush();
        }
        bw.close();
    }
}
