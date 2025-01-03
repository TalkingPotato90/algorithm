import java.io.*;
import java.util.*;

public class Main{
      public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] wood = new int[n + 1][m + 1];

    int count = 0;

    for (int i = 1; i <= n; i++) {
      String input = br.readLine();
      for (int j = 1; j <= m; j++) {
        wood[i][j] = input.charAt(j - 1) == '-' ? 1 : 2;

        if ((wood[i][j] == 1 && wood[i][j - 1] == 1) || (wood[i][j] == 2 && wood[i - 1][j] == 2)) {
          continue;
        }

        count++;
      }
    }

    System.out.println(count);
  }
}