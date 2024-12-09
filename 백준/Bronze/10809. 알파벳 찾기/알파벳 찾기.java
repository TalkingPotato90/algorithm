import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i) - 'a';
            if(arr[c] == -1){
                arr[c] = i;
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}