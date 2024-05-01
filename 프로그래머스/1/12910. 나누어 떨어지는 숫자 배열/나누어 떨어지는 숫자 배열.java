import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Set<Integer> temp = new HashSet<Integer>();
        
        for(int value : arr){
            if(value % divisor == 0){
                temp.add(value);
            }
        }
        
        if(temp.isEmpty()){
            temp.add(-1);
        }
        
        int[] answer = new int[temp.size()];
        int index = 0;
        
        Iterator<Integer> itrTemp = temp.iterator();
        while(itrTemp.hasNext()){
            answer[index++] = itrTemp.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}