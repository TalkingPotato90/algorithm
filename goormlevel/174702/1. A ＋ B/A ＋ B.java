import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int answer = 0;
			
			while(st.hasMoreTokens()){
				 answer += Integer.parseInt(st.nextToken());
			}
			
			bw.write(String.valueOf(answer));
			bw.flush();
		}
	}
}