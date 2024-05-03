class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ");
        int max = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[0]);
        
        for (int i = 1; i < temp.length; i++){
            max = Math.max(Integer.parseInt(temp[i]), max);
            min = Math.min(Integer.parseInt(temp[i]), min);
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append(min).append(" ").append(max);
        
        return answer.toString();
    }
}