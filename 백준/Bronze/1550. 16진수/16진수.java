
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int answer = Integer.parseInt(str, 16);
		
		bw.write(answer+"");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
	
}




