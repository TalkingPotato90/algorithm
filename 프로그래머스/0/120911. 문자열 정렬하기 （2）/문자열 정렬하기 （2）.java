import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String lowerString = my_string.toLowerCase();
        char[] temp = lowerString.toCharArray();
        
        Arrays.sort(temp);
        
        for(char c : temp){
            answer.append(c);
        }
        
        return answer.toString();
    }
}