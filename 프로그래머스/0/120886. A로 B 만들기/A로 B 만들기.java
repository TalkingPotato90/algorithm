class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        int count = 0;
        
        for(int i = 0; i < beforeChar.length; i++){
            for(int j = 0; j < afterChar.length; j++){
                if(beforeChar[i] == afterChar[j]){
                    count++;
                    afterChar[j] = '.';
                    break;
                }
            }
        }
        
        if(count == afterChar.length){
            answer = 1;
        }
        
        return answer;
    }
}