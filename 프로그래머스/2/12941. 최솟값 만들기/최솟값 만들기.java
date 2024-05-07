import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        List<Integer> temp = new ArrayList<>();
        for(int i : B){
            temp.add(i);
        }
        
        Collections.reverse(temp);
        
        for (int i = 0; i < A.length; i++){
            answer += A[i] * temp.get(i);
        }

        return answer;
    }
}