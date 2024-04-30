class Solution {
    public long solution(int a, int b) {
        long numA = a;
        long numB = b;
        long n = Math.abs(numA - numB) + 1;
        
        long answer = n * (numA + numB) / 2; 
        
        return answer;
    }
}