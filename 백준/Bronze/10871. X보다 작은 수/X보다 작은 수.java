

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int find = Integer.parseInt(st.nextToken());
		
		StringTokenizer digits = new StringTokenizer(br.readLine()); 

		String answer = "";
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(digits.nextToken());
			if(num < find) answer += num + " ";			
		}
		
		bw.write(answer);
		
		br.close();
		bw.close();
	}
}
