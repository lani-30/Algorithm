
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N < 100) bw.write(N+"");
		else if (N < 1000) bw.write(method(N)+"");
		else bw.write(method(999)+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	private static int method(int n) {
		
		int answer = 99;
		
		for(int i=100; i<=n; i++) {
			int a = i / 100;
			int b = (i-a*100) / 10;
			int c = i - (a*100 + b*10);
			
			if(a-b == b-c) answer++;
		}
		return answer;
	}
}