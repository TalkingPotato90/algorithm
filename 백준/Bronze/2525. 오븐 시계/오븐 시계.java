import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int time = Integer.parseInt(br.readLine());
        
        int endHour = hour;
        int endMinute = minute + time;
        
        int upHour = endMinute / 60;
        
        if(upHour != 0){
            endMinute = endMinute % 60;
            endHour += upHour;
        }
        
        if(endHour / 24 != 0){
            endHour = endHour % 24;
        }
        
        System.out.println(endHour + " " + endMinute);
    } 
}