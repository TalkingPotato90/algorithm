class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCnt = 0;
        int yCnt = 0;
        char[] text = s.toCharArray();
        
        for(char check : text){
            if(check == 'p' || check == 'P'){
                pCnt++;
            }
            if(check == 'y' || check == 'Y'){
                yCnt++;
            }
        }
        
        if(pCnt == yCnt){
            answer = true;
        }
        
        return answer;
    }
}