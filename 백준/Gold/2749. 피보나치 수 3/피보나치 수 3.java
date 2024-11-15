import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        int mod = 1000000;
        int pisano = 1500000;

        long reduce = n % pisano;

        System.out.println(fib(reduce,mod));
    }

    private static long fib(long n, int mod) {
        if (n == 0 || n == 1) {
            return n;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = (curr + prev) % mod;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}