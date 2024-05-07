class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int transCount = 0;
        
        while(!s.equals("1")){
            zero += checkZeroCount(s);
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            transCount++;
        }
        
        int[] answer = {transCount, zero};
        return answer;
    }
    
    public int checkZeroCount(String s){
        int zeroCount = 0;
        
        while(s.contains("0")){
            s = s.replaceFirst("0","");
            zeroCount++;
        }
        
        return zeroCount;
    }
}