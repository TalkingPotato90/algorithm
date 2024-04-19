class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sum = new StringBuilder();
        
        char[] convertBin1 = String.format("%10s",bin1).replaceAll(" ","0").toCharArray();
        char[] convertBin2 = String.format("%10s",bin2).replaceAll(" ","0").toCharArray();
                 
        int temp = 0;
        
        for(int i = 9; i > 0; i--){
            temp = ((convertBin1[i]-'0') + (convertBin2[i]-'0'));
            
            if(temp == 0){
                sum.append("0");
            }else if (temp == 1){
                sum.append("1");
            }else if (temp == 2){
                sum.append("0");
                convertBin1[i-1]++;
            }else if (temp == 3){
                sum.append("1");
                convertBin1[i-1]++;
            }
        }
        
        temp = ((convertBin1[0]-'0') + (convertBin2[0]-'0'));
        
        if (temp == 1){
            sum.append("1");
        }else if (temp == 2){
            sum.append("01");
        }else if (temp == 3){
            sum.append("11");
        }
        
        sum = sum.reverse();
        
        long trim = Long.parseLong(sum.toString());
        
        String answer = String.valueOf(trim);
        
        return answer;
    }
}