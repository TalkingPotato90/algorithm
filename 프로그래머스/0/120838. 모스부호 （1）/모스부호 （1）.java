import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        
        String answer = "";
        StringBuilder decodeLetter = new StringBuilder();
        String[] letterArray = letter.split(" ");
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, Character> decoder = new HashMap<>();
        
        char alphabet = ' ';
        
        for (int i = 0; i < morse.length; i++){
            alphabet = (char)('a'+ i);
            decoder.put(morse[i], alphabet);
        }
        
        for(String value : letterArray){
            decodeLetter.append(decoder.get(value));
        }
        
        answer = decodeLetter.toString();
        
        return answer;
    }
}