class Solution {
    public static int gcd(int a, int b){
        int temp =0;
        while(b!=0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
    
    public int solution(int n) {
        int answer = lcm(n,6) / 6;
        return answer;
    }
}