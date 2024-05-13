import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> temp = new ArrayList<>();
        
        for(int i : numlist){
            if(i % n == 0){
                temp.add(i);
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}