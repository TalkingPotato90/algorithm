import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        int sum = sides[0] + sides[1];
        int max = sides[2];
        
        if(max >= sum){
            answer = 2;
        }
        
        return answer;
    }
}