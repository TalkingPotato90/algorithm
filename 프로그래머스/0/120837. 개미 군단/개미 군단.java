class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = hp / 5;
        int gHp = hp % 5;
        int soldier = gHp / 3;
        int worker = gHp % 3;
        
        answer = general + soldier + worker;
        return answer;
    }
}