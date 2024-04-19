class Solution {
    public int solution(int[] numbers) {
        int max=0;
        int second=0;;
        
        for(int i = 0; i < numbers.length; i++){
            if (max <= numbers[i]){
                second = max;
                max = numbers[i];
            } else if (second <= numbers[i] && numbers[i] <= max) {
            second = numbers[i];
            }
        }
        
        int answer = max * second;
        
        return answer;
    }
}