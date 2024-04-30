class Solution {
    public long[] solution(int x, int n) {
        long tmepX = x;
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++){
            answer[i] = tmepX * (i+1);
        }

        return answer;
    }
}