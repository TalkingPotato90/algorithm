import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        // 최초 1회 실행
        String defaultQuestion = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
        // (count + 1) 회 실행
        String recursionQuestion1 = "\"재귀함수가 뭔가요?\"\n";
        // count 회 실행
        String recursionQuestion2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        String recursionQuestion3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        String recursionQuestion4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        // 1회 실행
        String recursionAnswer1 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        // (count + 1) 회 실행
        String recursionAnswer2 = "라고 답변하였지.\n";

        String underbar = "____";

        sb.append(defaultQuestion);

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(underbar);
            }
            sb.append(recursionQuestion1);
            for (int j = 0; j < i; j++) {
                sb.append(underbar);
            }
            sb.append(recursionQuestion2);
            for (int j = 0; j < i; j++) {
                sb.append(underbar);
            }
            sb.append(recursionQuestion3);
            for (int j = 0; j < i; j++) {
                sb.append(underbar);
            }
            sb.append(recursionQuestion4);
        }

        for (int i = count; i > 0; i--) {
            sb.append(underbar);
        }
        sb.append(recursionQuestion1);
        for (int i = count; i > 0; i--) {
            sb.append(underbar);
        }
        sb.append(recursionAnswer1);

        for(int j = count + 1; j > 0; j--) {
            for (int i = 1; i < j; i++) {
                sb.append(underbar);
            }
            sb.append(recursionAnswer2);
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}