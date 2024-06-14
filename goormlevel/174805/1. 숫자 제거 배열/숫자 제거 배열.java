import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			List<String> list = new ArrayList<>();
			String input1 = br.readLine();
			String input2 = br.readLine();
			StringTokenizer st = new StringTokenizer(input2);
			String[] base = input1.split(" ");
			String datum = base[1];
			String token = "";
			
			while(st.hasMoreTokens()){
				token = st.nextToken();
				if(!token.contains(datum)){
					list.add(token);
				}
			}
			
			bw.write(String.valueOf(list.size()));
			bw.flush();
		}
	}
}