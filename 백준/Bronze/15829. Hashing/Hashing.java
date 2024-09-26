import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();

        int hashAlpha;
        BigInteger hash = BigInteger.valueOf(0);
        BigInteger num = BigInteger.valueOf(31);

        for (int i = 0; i < length; i++) {
            hashAlpha = str[i] - 96;
            hash = hash.add(BigInteger.valueOf(hashAlpha).multiply(num.pow(i))).mod(BigInteger.valueOf(1234567891));
        }

        bw.write(hash.toString());
        bw.flush();
        bw.close();
    }
}