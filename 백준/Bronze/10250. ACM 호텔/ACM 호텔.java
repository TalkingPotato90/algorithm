import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = n % h;
            if(floor == 0){
                floor = h;
            }

            int room = n / h;
            if(n % h != 0){
                room += 1;
            }
            
            String roomNumber = String.valueOf(room);
            if(roomNumber.length() == 1){
                roomNumber = "0" + roomNumber;
            }

            System.out.println(floor+""+roomNumber);
        }
    }
}