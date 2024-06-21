import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int answer = 0 ;
		
		for(int i=5; N/i >0; i*=5) {
			answer += N/i;
		}
		
		bw.write(answer+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
