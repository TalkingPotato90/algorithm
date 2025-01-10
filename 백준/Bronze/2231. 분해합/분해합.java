import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i < n; i++){
            String[] str = String.valueOf(i).split("");
            int sum = i;
            
            for(int j = 0; j < str.length; j++){
                sum += Integer.parseInt(str[j]);
            }
            
            if (sum == n){
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(0);
    }
}