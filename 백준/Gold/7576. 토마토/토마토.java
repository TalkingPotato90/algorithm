import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] box = br.readLine().split(" ");

        int x = Integer.parseInt(box[1]);
        int y = Integer.parseInt(box[0]);
        int day = -1;

        int[][] tomato = new int[x][y];

        Stack<int[]> firstStack = new Stack<>();
        Stack<int[]> tempStack = new Stack<>();

        String[] tomatoLine;

        for (int i = 0; i < x; i++) {
            tomatoLine = br.readLine().split(" ");
            for (int j = 0; j < y; j++) {
                tomato[i][j] = Integer.parseInt(tomatoLine[j]);

                if (tomato[i][j] == 1) {
                    firstStack.push(new int[]{i, j});
                }
            }
        }

        if (firstStack.isEmpty()) {
            day = -1;
        } else {
            while (!firstStack.isEmpty()) {
                while (!firstStack.isEmpty()) {
                    int[] base = firstStack.pop();

                    int[] tempRight = new int[]{base[0] + 1, base[1]};
                    int[] tempLeft = new int[]{base[0] - 1, base[1]};
                    int[] tempUp = new int[]{base[0], base[1] - 1};
                    int[] tempDown = new int[]{base[0], base[1] + 1};

                    if (tempRight[0] < x && tomato[tempRight[0]][tempRight[1]] == 0) {
                        tomato[tempRight[0]][tempRight[1]] = 1;
                        tempStack.push(tempRight);
                    }

                    if (tempLeft[0] >= 0 && tomato[tempLeft[0]][tempLeft[1]] == 0) {
                        tomato[tempLeft[0]][tempLeft[1]] = 1;
                        tempStack.push(tempLeft);
                    }

                    if (tempUp[1] >= 0 && tomato[tempUp[0]][tempUp[1]] == 0) {
                        tomato[tempUp[0]][tempUp[1]] = 1;
                        tempStack.push(tempUp);
                    }

                    if (tempDown[1] < y && tomato[tempDown[0]][tempDown[1]] == 0) {
                        tomato[tempDown[0]][tempDown[1]] = 1;
                        tempStack.push(tempDown);
                    }
                }
                day++;
                firstStack.addAll(tempStack);
                tempStack.clear();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tomato[i][j] == 0) {
                    day = -1;
                    break;
                }
            }
        }

        bw.write(day + "\n");
        bw.flush();
        bw.close();
    }
}