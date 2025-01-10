import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        if(!isString(first)){
            int i = Integer.parseInt(first);
            System.out.println(word(i + 3));
            return;
        }

        if(!isString(second)){
            int i = Integer.parseInt(second);
            System.out.println(word(i + 2));
            return;
        }

        if(!isString(third)){
            int i = Integer.parseInt(third);
            System.out.println(word(i + 1));
            return;
        }
    }

    private static boolean isString(String str){
        return str.equals("Fizz") || str.equals("Buzz") || str.equals("FizzBuzz");
    }

    private static String word(int i){
        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        }
        if(i % 3 == 0 && i % 5 != 0){
            return "Fizz";
        }
        if(i % 3 != 0 && i % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(i);
    }
}