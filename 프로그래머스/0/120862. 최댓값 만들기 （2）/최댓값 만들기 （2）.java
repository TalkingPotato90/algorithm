import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int temp1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int temp2 = temp1;
        
        if(numbers[0] < 0 && numbers[1] < 0){
            temp2 = numbers[0] * numbers[1];
        }
        
        int answer = temp1;
        
        if(temp1 < temp2) {
            answer = temp2;
        }
        
        return answer;
    }
}