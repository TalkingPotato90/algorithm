class Solution {
    public int solution(int n, int t) {
        double a = n;
        double b = t;
        
        int answer = (int)Math.pow(2,b) * n;
        
        return answer;
    }
}