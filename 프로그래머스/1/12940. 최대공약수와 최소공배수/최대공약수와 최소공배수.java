class Solution {
    public int[] solution(int n, int m) {
        int gcdNum = gcd(n,m);
        int lcm = n * m  / gcdNum;
        int[] answer = {gcdNum,lcm};
        return answer;
    }
    
    public int gcd(int n, int m){
        if(m == 0){
            return n;
        } else
            return gcd(m, n % m);
    }
}