import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            String quiz = br.readLine();
            String[] quizArr = quiz.split("");
            int totalScore = 0;
            int score = 0;

            for (String s : quizArr) {
                if (s.equals("O")) {
                    score++;
                } else {
                    score = 0;
                }

                totalScore += score;
            }
            System.out.println(totalScore);
        }
    }
}