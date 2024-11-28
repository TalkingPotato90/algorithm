class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int match = 0;
        int zero = 0;
        
        for(int lotto : lottos){
            if(lotto == 0){
                zero++;
                continue;
            }
            for (int win : win_nums){
                if (lotto == win){
                    match++;
                }
            }
        }
        
        int max = calculate(match + zero);
        int min = calculate(match);
        
        int[] answer = {max, min};
        
        return answer;
    }
    
    public static int calculate(int count){
        switch(count){
            case 2: return 5;
            case 3 : return 4;
            case 4 : return 3;
            case 5 : return 2;
            case 6 : return 1;
                default : return 6;
        }
    }
}