import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }
        
        while (q.size() > 1){
            System.out.print(q.poll() + " ");
            q.offer(q.poll());
        }
        
        System.out.println(q.poll());
    }
}