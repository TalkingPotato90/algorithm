class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        if((count(s) == true) && s.startsWith("(") && s.endsWith(")")){
            answer = true;
        }

        return answer;
    }
    
    boolean count(String s){
        char[] temp = s.toCharArray();
        int open = 0;
        int close = 0;
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == '('){
                open++;
            }else
                close++;
            if(close > open){
                break;
            }
        }
        
        return open == close;
    }
}