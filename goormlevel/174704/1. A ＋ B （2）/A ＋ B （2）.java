import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			
			double answer = 0;
			
			while(st.hasMoreTokens()){
				answer += Double.parseDouble(st.nextToken());
			}
			
			bw.write(String.format("%.6f", answer));
			bw.flush();
		}//try
	}//main
}//class