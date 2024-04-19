class Solution {
    public int solution(int n) {
        int answer = 1;
        int b = 0;
        for(int i=1; i<n; i++){
            b = n/i;
            if(i * b == n){
                answer++;
            }
        }
        return answer;
    }
}