class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] temp = new int[absolutes.length];
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                temp[i] = absolutes[i]; 
            }else{
                temp[i] = -absolutes[i];
            }
        }
        
        for (int sum : temp){
            answer += sum;
        }
        
        return answer;
    }
}