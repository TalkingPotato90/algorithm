import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] wood = new int[n][m];

        int count = 0;

        for (int i = 0; i < n; i++) {
          String[] input = br.readLine().split("");
          for (int j = 0; j < m; j++) {
        
            wood[i][j] = input[j].equals("-") ? 1 : 2;
        
            if (j == 0 && wood[i][j] == 1) {
              count++;
              continue;
            }

            if (j > 0 && wood[i][j] == 1) {
              if (wood[i][j - 1] == wood[i][j]) {
                continue;
              }
            }

            if (i == 0 && wood[i][j] == 2) {
              count++;
              continue;
            }

            if (i > 0 && wood[i][j] == 2) {
              if (wood[i - 1][j] == wood[i][j]) {
                continue;
              }
            }

            count++;
          }
        }

        System.out.println(count);
      }
}