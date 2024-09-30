import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int disk = Integer.parseInt(br.readLine());

        int moves = (int)Math.pow(2,disk) - 1;
        sb.append(moves).append("\n");

        hanoi(sb,disk,1,2,3);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void hanoi(StringBuilder sb, int disk, int start, int temp, int goal){
        if (disk == 1) {
            sb.append(start).append(" ").append(goal).append("\n");
            return;
        }
        hanoi(sb,disk - 1, start, goal, temp);
        sb.append(start).append(" ").append(goal).append("\n");
        hanoi(sb,disk - 1, temp, start, goal);
    }
}