class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (answer != 501){
            if (num == 1){
                break;
            } else if (num % 2 == 0){
                num /= 2;
                answer++;
                continue;
            } else if (num % 2 != 0){
                num = num * 3 + 1;
                answer++;
                continue;
            }
        }
        
        if (answer == 501){
            answer = -1;
        }
        
        return answer;
    }
}