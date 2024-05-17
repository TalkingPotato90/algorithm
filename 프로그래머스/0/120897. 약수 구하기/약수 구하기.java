import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {        
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                temp.add(i);
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = temp.get(i); 
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}