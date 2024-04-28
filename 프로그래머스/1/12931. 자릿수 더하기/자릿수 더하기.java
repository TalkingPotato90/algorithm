public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = String.valueOf(n);
        char[] nChar = temp.toCharArray();
        
        for(char c : nChar){
            answer += (int)(c-'0');
        }
        
        return answer;
    }
}