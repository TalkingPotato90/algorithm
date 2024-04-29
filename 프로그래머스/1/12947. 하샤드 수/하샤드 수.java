class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String[] temp = Integer.toString(x).split("");
        
        int sum = 0;
        
        for(String s : temp){
            sum += Integer.parseInt(s);
        }
        
        if(x % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}