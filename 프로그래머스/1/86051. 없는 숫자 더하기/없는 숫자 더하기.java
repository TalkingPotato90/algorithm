class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int total = 45;

        for(int i : numbers){
            sum += i;
        }
        
        int answer = total - sum;
        
        return answer;
    }
}