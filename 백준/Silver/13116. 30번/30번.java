import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());

        int[] tree = new int[1023];

        for (int i = 0; i < 1023; i++) {
            tree[i] = i+1;
        }

        for (int i = 0; i < testcases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int indexA = a - 1;
            int indexB = b - 1;

            while (indexA != indexB) {
                if (indexA > indexB) {
                    indexA = (indexA - 1) / 2;
                } else {
                    indexB = (indexB - 1) / 2;
                }
            }

            System.out.println(tree[indexA] * 10);

        }
    }
}