class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int widthN = 0;
        int lengthN = 0;
        int heightN = 0;
        
        while (box[0] >= n){
            widthN++;
            box[0] -= n;
        }
        
        while (box[1] >= n){
            lengthN++;
            box[1] -= n;
        }
        
        while (box[2] >= n){
            heightN++;
            box[2] -= n;
        }
        
        answer = widthN * lengthN * heightN;
        
        return answer;
    }
}