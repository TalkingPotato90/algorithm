import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n + m; i++){
            String input = br.readLine();
            if( i < n){
                String[] tokens = input.split(" ");
                String site = tokens[0].intern(); 
                String pass = tokens[1].intern();
                map.put(site, pass);
            } else {
                String site = input.intern();
                sb.append(map.get(site)).append("\n");
            }
        }
        System.out.println(sb);
    }
}