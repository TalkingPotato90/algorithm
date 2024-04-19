class Solution {
    public int[] solution(int[] emergency) {
        int level = 1;
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j])
                    level++;
            }
            answer[i] = level;
            level = 1;
        }
        return answer;
    }
}