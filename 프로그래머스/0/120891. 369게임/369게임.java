class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] clap = String.valueOf(order).toCharArray();
        
        for(char c : clap){
            if(c == '3' || c == '6' || c =='9'){
                answer++;
            }
        }
        
        return answer;
    }
}