import java.io.*;
import java.util.*;

public class Main{
      public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int[] temp = new int[n];
    int cnt = 0;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      temp[i] = Integer.parseInt(st.nextToken());
      cnt++;
      sum += temp[i];
      if (cnt > k) {
        sum -= temp[i - k];
      }
      if (cnt >= k) {
        max = Math.max(sum, max);
      }
    }

    System.out.println(max);
  }
}