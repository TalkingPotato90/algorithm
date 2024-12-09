import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        long result = a * b * c;
        
        String resultString = String.valueOf(result);
        String[] arr = resultString.split("");
        int[] finalArr = new int[10];
        
        for(int i = 0; i < arr.length; i++){
            int temp = Integer.parseInt(arr[i]);
            finalArr[temp]++;
        }
        
        for(int i : finalArr){
            System.out.println(i);
        }
    }
}