class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int index = array.length / 2;
        int temp = 0;
        
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        
        answer = array[index];
        return answer;
    }
}