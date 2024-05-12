class Solution {
    public int[] solution(int[] array) {
        int maxValue = array[0];
        int index = 0;
    
        for (int i = 0; i < array.length; i++){
            if(maxValue < array[i]){
                maxValue = array[i];
                index = i;
            }
        }
        
        int[] answer = {maxValue,index};
        
        return answer;
    }
}