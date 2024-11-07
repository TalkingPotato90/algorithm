import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            int operations = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int j = 0; j < operations; j++) {
                String[] input = br.readLine().split(" ");
                char command = input[0].charAt(0);
                int value = Integer.parseInt(input[1]);
                if (command == 'I') {
                    map.put(value, map.getOrDefault(value, 0) + 1);
                } else if (command == 'D') {
                    if (map.isEmpty()) continue;
                    int key = value == 1 ? map.lastKey() : map.firstKey();
                    if (map.put(key, map.get(key) - 1) == 1) {
                        map.remove(key);
                    }
                }
            }
            if (map.isEmpty()){
                System.out.println("EMPTY");
            }else {
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }
    }
}