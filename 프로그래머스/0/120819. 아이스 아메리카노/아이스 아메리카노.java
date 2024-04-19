class Solution {
    public int[] solution(int money) {
        int americano = money / 5500;
        int change = money % 5500;
        int[] answer = new int[]{americano, change};
        return answer;
    }
}