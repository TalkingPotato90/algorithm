import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> temp = new ArrayList<>();
        int num = arr[0];
        temp.add(num);
        
        for(int i = 1; i < arr.length; i++){
            if (num != arr[i]){
                num = arr[i];
                temp.add(num);
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i).intValue();
        }

        return answer;
    }
}