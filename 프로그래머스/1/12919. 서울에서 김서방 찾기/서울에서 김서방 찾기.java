class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(String s : seoul){
            if(s.equals("Kim")){
                sb.append("김서방은 ").append(index).append("에 있다");
                break;
            }
            index++;
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}