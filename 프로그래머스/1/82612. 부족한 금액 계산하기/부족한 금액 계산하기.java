class Solution {
    public long solution(int price, int money, int count) {
        long sum = price + count;
        long multi = price * count;
        long totalPrice = multi * (count + 1) / 2;
        long answer = 0;
        
        if(totalPrice > money){
            answer = totalPrice - money;
        }

        return answer;
    }
}