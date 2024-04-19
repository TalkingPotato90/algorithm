class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder winRsp = new StringBuilder();
        char[] inputRsp = rsp.toCharArray();
        for(int i = 0; i < inputRsp.length; i++){
            if(inputRsp[i] == '2'){
                winRsp.append(0);
            }else if(inputRsp[i] == '0'){
                winRsp.append(5);
            }else{
                winRsp.append(2);
            }
        }
        answer = winRsp.toString();
        
        return answer;
    }
}