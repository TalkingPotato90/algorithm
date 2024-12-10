import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int xl = sc.nextInt();
        int xxl = sc.nextInt();
        int xxxl = sc.nextInt();

        int t = sc.nextInt();
        int p = sc.nextInt();

        int resultT = 0;
        int resultP = n / p;
        int remainP = n % p;

        resultT += calculate(s,t);
        resultT += calculate(m,t);
        resultT += calculate(l,t);
        resultT += calculate(xl,t);
        resultT += calculate(xxl,t);
        resultT += calculate(xxxl,t);

        System.out.println(resultT);
        System.out.println(resultP + " " + remainP);
    }

    public static int calculate(int product, int count){
        int result = 0;
        if(product == 0){
            return 0;
        }

        if(product > count && product % count == 0){
            result = product / count;
        }else if(product > count && product % count != 0){
            result = product / count + 1;
        }else if(product <= count){
            result = 1;
        }

        return result;
    }
}