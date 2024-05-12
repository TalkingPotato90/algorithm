class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] temp = my_string.split("");
        for(String s : temp){
            if(s.matches("[A-Z]")){
                answer.append(s.toLowerCase());
            }else{
                answer.append(s.toUpperCase());
            }
        }
        return answer.toString();
    }
}