import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int result = -1;
        
        for(int i = n / 5; i >= 0; i--){
            int remain = n - (5 * i);
            if(remain % 2 == 0){
                int two = remain / 2;
                result = i + two;
                break;
            }
        }
        
        System.out.println(result);
    }
}