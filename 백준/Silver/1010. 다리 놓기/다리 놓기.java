
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] nm = new int[30][30];
		
		// (n == r, r==0)
		for(int i=0; i<30; i++) {
			nm[i][i] = 1;
			nm[i][0] = 1;
		}
		
		for(int i=2; i<30; i++) {
			for(int j=1; j<30; j++) {
				nm[i][j] = nm[i-1][j-1] + nm[i-1][j];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(nm[M][N]).append('\n');
		}
		
		bw.write(sb+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
}