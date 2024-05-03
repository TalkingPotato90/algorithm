import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        boolean length = s.length() == 4 || s.length() == 6;
        if(!length || s.matches(".*[^0-9].*")){
            answer = false;
        }
        return answer;
    }
}