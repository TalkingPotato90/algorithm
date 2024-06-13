import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			String input = br.readLine();
			int inputNum = Integer.parseInt(input);
			int divideNum = 1000000007;
			long answer = 1;
			
			for(int i = 1; i <= inputNum; i++){
				answer = (answer * i) % divideNum; 
			}
			
			bw.write(String.valueOf(answer));
			bw.flush();
		}
	}
}