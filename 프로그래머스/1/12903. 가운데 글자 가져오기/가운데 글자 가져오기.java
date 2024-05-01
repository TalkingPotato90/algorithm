class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int midIndex = s.length() / 2;
        
        if(s.length() % 2 == 0){
            answer.append(s.charAt(midIndex-1)).append(s.charAt(midIndex));
        }else{
            answer.append(s.charAt(midIndex));
        }
        
        return answer.toString();
    }
}