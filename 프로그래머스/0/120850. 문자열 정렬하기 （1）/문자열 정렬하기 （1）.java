import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String trans = my_string.replaceAll("[a-z]","");
        int[] answer = new int[trans.length()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = (int)(trans.charAt(i)-'0');
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}