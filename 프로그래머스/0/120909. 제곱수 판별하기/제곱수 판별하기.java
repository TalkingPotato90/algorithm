class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i = 1; i < n ; i++){
            if(i == (n / i) && (n % i == 0)) answer = 1;
        }
        return answer;
    }
}