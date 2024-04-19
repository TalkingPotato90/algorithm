class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int result : array){
           if(height < result){
               answer++;
           } 
        }
        return answer;
    }
}