class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("left")){
            for(int i = 0; i < numbers.length; i++){
                if(i == 0){
                    answer[numbers.length-1] = numbers[0];
                } else
                answer[i-1] = numbers[i];
            }
        }else{
            for(int i = 0; i < numbers.length; i++){
                if(i == numbers.length - 1){
                    answer[0] = numbers[numbers.length -1];
                } else
                answer[i+1] = numbers[i];
            }
        }
        return answer;
    }
}