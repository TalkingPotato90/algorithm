import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> temp = new ArrayList<>();
        double answer = 0;
        
        while(n > 2) {
            temp.add(n % 3);
            n = n / 3;
        }
        
        if (n != 0){
            temp.add(n);
        }
        
        int index = 0;
        
        for(int i = temp.size()-1; i >= 0; i--){
            answer += temp.get(index++) * Math.pow(3 , i);
        }
        
        return (int)answer;
    }
}