import java.io.*;
import java.util.*;

public class Main{
    static int[] arr;
    static int[] operator = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i =0; i < 4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(1, arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int depth, int current){
        if(depth == arr.length){
            max = Math.max(max, current);
            min = Math.min(min, current);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(operator[i] > 0){
                operator[i]--;
                int next = calculate(current, arr[depth], i);
                dfs(depth + 1, next);
                operator[i]++;
            }
        }
    }

    private static int calculate(int a, int b, int operator){
        switch(operator){
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            case 3: return a / b;
        }
        return 0;
    }
}