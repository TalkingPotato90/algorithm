class Solution {
    public int[][] solution(int[] num_list, int n) {
        int answerLength = num_list.length / n;
        int[][] answer = new int[answerLength][n];
        int index = 0;
        
        for(int i = 0; i < answerLength; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[index++];
                }
        }
        
        return answer;
    }
}