class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int maskingLength = phone_number.length() - 4;
        String origin = phone_number.substring(maskingLength);
        
        for (int i = 0; i < maskingLength; i++){
            answer.append("*");
        }
        
        answer.append(origin);
        
        return answer.toString();
    }
}