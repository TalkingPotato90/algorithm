class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int index = code - 1;
        
        for(; index < cipher.length(); index += code){
            answer.append(cipher.charAt(index));
        }
        
        return answer.toString();
    }
}