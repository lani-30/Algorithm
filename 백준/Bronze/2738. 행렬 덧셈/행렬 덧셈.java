
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];

		for(int i=0; i<n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				arr1[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				arr2[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				bw.write(arr1[i][j] + arr2[i][j]+" ");
			}
			bw.write("\n");
		}
		
		
		br.close();
		bw.close();
	}
}

