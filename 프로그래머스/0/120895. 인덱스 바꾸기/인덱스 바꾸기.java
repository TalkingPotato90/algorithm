class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        
        char[] temp = my_string.toCharArray();
        
        for(int i = 0; i < temp.length; i++){
            if(i == num1){
                answer.append(temp[num2]);
            }else if(i == num2){
                answer.append(temp[num1]);
            }else{
                answer.append(temp[i]);
            }
        }
        
        return answer.toString();
    }
}