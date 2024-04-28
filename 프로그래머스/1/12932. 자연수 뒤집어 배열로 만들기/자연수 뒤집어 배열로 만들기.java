class Solution {
    public int[] solution(long n) {
        char[] temp = String.valueOf(n).toCharArray();
        int[] answer = new int[temp.length];
        
        for(int i = temp.length -1, j = 0; i >= 0; i--){
            answer[j] = (int)(temp[i]-'0');
            j++;
        }
        
        return answer;
    }
}