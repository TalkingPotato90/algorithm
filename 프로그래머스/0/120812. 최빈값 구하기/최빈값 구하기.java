class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int temp = 0;
        int[] count = new int[1000];
        
        for(int i = 0;  i < array.length; i++){
            temp = array[i];
            count[temp]++;
        }
        
        for(int i = 0; i < 1000; i++){
           if(count[i] > max){
               max = count[i];
               answer = i;
           } else if(count[i] == max){
               answer = -1;
           }
        }
    
        return answer;
    }
}