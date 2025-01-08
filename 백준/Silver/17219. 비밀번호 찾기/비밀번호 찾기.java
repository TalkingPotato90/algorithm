import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, List<Entry>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            char[] site = st.nextToken().toCharArray();
            char[] pass = st.nextToken().toCharArray();

            int siteHash = Arrays.hashCode(site);

            map.putIfAbsent(siteHash, new ArrayList<>());
            map.get(siteHash).add(new Entry(site, pass));
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++){
            char[] site = br.readLine().toCharArray();
            int siteHash = Arrays.hashCode(site);

            List<Entry> entries = map.get(siteHash);
            if (entries != null) {
                for (Entry entry : entries) {
                    if (Arrays.equals(entry.site, site)) {
                        sb.append(entry.pass).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.print(sb.toString());
    }

    static class Entry {
        char[] site;
        char[] pass;

        Entry(char[] site, char[] pass) {
            this.site = site;
            this.pass = pass;
        }
    }
}