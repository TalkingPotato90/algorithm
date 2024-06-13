import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
		int length = Integer.parseInt(br.readLine());
		String input = br.readLine();
		char[] temp = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : temp){
			if(Character.isLowerCase(c)){
				c = Character.toUpperCase(c);
				sb.append(c);
			}else if(Character.isUpperCase(c)){
				c = Character.toLowerCase(c);
				sb.append(c);
			} // end else if
		} // end for
		
		bw.write(sb.toString());
		bw.flush();
		} // try
	} // main
} // class