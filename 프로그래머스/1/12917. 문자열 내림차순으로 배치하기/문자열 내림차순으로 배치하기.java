import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] temp = s.toCharArray();
        
        Arrays.sort(temp);
        
        for(char c : temp){
            answer.append(c);
        }
        
        answer.reverse();
        
        return answer.toString();
    }
}