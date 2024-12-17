import java.io.*;
import java.util.*;

public class Main{
    public static int[][] wood;
    public static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        wood = new int[n][m];
        visited = new boolean[n][m];
        int count = 0;
        
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split("");
            for(int j = 0; j < m; j++){
                wood[i][j] = input[j].equals("-") ? 1:2;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && wood[i][j] == 1){
                    visited[i][j] = true;
                    while(j + 1 < m && wood[i][j+1] == 1){
                        visited[i][++j] = true;
                    }
                    count++;
                }
            }
        }
        
        for(int j = 0; j< m; j++){
            for(int i = 0; i < n; i++){
                if(!visited[i][j] && wood[i][j] == 2){
                    visited[i][j] = true;
                    while (i + 1 < n && wood[i+1][j] == 2){
                        visited[++i][j] =true;
                    }
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}