class Solution {
    public int solution(int left, int right) {
        int answer = calculateNumber(createNumArray(left, right), convertNumArray(createNumArray(left, right)));
        return answer;
    }
    
    public int[] createNumArray(int a, int b){
        int range = b - a + 1;
        int[] num = new int[range];
        
        for(int i = 0; i < range; i++){
            num[i] = a++;
        }
        
        return num;
    }
    
    public int[] convertNumArray(int[] num){
        int[] count = new int[num.length];
        int cnt = 0;
        
        for(int i = 0; i < num.length; i++){
            for(int j = 1; j * j <= num[i]; j++){
                if(j * j == num[i]){
                    cnt++;
                }else if (num[i] % j == 0){
                        cnt += 2;
                }
            }
            count[i] = cnt;
            cnt = 0;
        }
        
        return count;
    }
    
    public int calculateNumber(int[] num, int[] count){
        int sum = 0;
        
        for(int i = 0; i < num.length; i++){
            if(count[i] % 2 == 0){
                sum += num[i];
            }else{
                sum -= num[i];
            }
        }
        return sum;
    }
}