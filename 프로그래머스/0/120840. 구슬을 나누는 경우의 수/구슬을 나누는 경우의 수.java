import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 1;
        
        BigInteger ballFac = factorial(balls);
        BigInteger shareFac = factorial(share);
        BigInteger tempFac = factorial(balls - share);
        
        BigInteger lAnswer = ballFac.divide(shareFac.multiply(tempFac));
        
        answer = lAnswer.intValue();
        
        return answer;
    }
    
    public BigInteger factorial(int num) {
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
}