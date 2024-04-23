import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                n /= i;
                if(!temp.contains(i)){
                    temp.add(i);
                }
            }
        }
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}