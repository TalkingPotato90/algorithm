import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = sc.nextInt();
        
        System.out.println(s.charAt(idx-1));
    }
}