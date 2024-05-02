import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int temp = arr[0];
        
        List<Integer> numList = new ArrayList<>();
        
        for(int i : arr){
            numList.add(i);
            
            if( temp > i){
                temp = i;
            }
        }
        
        int index = numList.indexOf(temp);
        
        numList.remove(index);
        
        if(numList.isEmpty()){
            numList.add(-1);
        }
        
        int[] answer = new int[numList.size()];
        
        for(int i = 0; i < numList.size(); i++){
            answer[i] = numList.get(i).intValue();
        }
        
        return answer;
    }
}