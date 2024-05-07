class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] temp = s.toCharArray();
        
        for(char c : temp){
            
            if (c == ' '){
                answer.append(' ');
                continue;
            } else if (c >= 'A' && c <= 'Z'){
                c += n;
                if(c > 'Z'){
                    c -= 26;
                }
                answer.append(c);
            } else if (c >= 'a' && c <= 'z'){
                c += n;
                if(c > 'z'){
                    c -= 26;
                }
                answer.append(c);
            }
        }
        return answer.toString();
    }
}