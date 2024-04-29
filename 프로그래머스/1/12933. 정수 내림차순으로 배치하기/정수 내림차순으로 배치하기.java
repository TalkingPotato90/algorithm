import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] ansArray = Long.toString(n).split("");
        
        Arrays.sort(ansArray, Collections.reverseOrder());
        
        StringBuilder temp = new StringBuilder();
        
        for(String s : ansArray){
            temp.append(s);
        }
        
        answer = Long.parseLong(temp.toString());
        
        return answer;
    }
}