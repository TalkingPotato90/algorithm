class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i < 11; i++){
            if(factorial(i) >= n){
                answer = i;
                break;
            }   
        }
        return answer;
    }
    
    public int factorial(int j){
        for(int i = j; i >= 1; i--){
            j *= i;
        }
        return j;
    }
}