import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();

        int hashAlpha;
        long hash = 0;

        for (int i = 0; i < length; i++) {
            hashAlpha = str[i] - 96;
            hash += hashAlpha * (long)Math.pow(31, i);
        }

        bw.write(Long.toString(hash));
        bw.flush();
        bw.close();
    }
}