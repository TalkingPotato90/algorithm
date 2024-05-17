class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String temp = String.valueOf(num);
        
        for(int i = temp.length(); i > 0; i--){            
            if(k == num % 10){
                answer = i;
            }            
            num /= 10;
        }
        return answer;
    }
}