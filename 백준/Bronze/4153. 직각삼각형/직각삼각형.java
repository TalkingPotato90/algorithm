import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();

            if(str.equals("0 0 0")){
                break;
            }

            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int[] arr = {a * a, b * b, c * c};

            Arrays.sort(arr);

            if( arr[0] + arr[1] == arr[2]){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }

    }
}