class Solution {
    public int gcd(int a, int b){
        if (a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm =(denom1 * denom2) / gcd(denom1,denom2);
        int temp1 = ((lcm/denom1)*numer1) + ((lcm/denom2)*numer2);
        int result = gcd(temp1, lcm);
        int[] answer = new int[] {temp1/result,lcm/result};
        return answer;
    }
}