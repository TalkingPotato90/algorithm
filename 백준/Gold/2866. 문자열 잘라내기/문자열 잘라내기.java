import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[] lines = new String[R];

        for (int i = 0; i < R; i++) {
            lines[i] = br.readLine();
        }

        String[] newLines = new String[C];
        Arrays.fill(newLines, "");

        for(String line : lines) {
            for(int i = 0; i < C; i++) {
                newLines[i] += line.charAt(i);
            }
        }

        int result = 0;
        for(int i = 0; i < R; i++) {
            Set<String> unique = new HashSet<>(Arrays.asList(newLines));
            if(unique.size() < C) {
                break;
            }
            result++;

            for (int j = 0; j < C; j++) {
                newLines[j] = newLines[j].substring(1);
            }
        }

        System.out.println(result - 1);

    }
}