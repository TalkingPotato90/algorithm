import java.io.*;
import java.util.*;

public class Main{
    static int l, c;
    static List<String> list = new ArrayList<>();
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            list.add(st.nextToken());
        }

        Collections.sort(list);

        generate("", 0, 0);

        for (String s : result) {
            System.out.println(s);
        }
    }

    private static void generate(String current, int index, int depth) {
        if (depth == l) {
            if(isValid(current)){
                result.add(current);
            }
            return;
        }

        for (int i = index; i < c; i++) {
            generate(current + list.get(i), i + 1, depth + 1);
        }
    }

    private static boolean isValid(String word){
        int mo = 0;
        String[] mos = {"a","e","i","o","u"};

        for(String s: mos){
            if(word.contains(s)){
                mo++;
            }
        }

        int ja = word.length() - mo;

        return mo >= 1 && ja >= 2;
    }
}