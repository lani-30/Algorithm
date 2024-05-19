
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[][] = new int[9][9];
		
		int max = 0;
		
		int row = -1;
		int col = -1;
		
		for(int i=0; i<9; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<9; j++) {
				
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] >= max) {
					max = arr[i][j];
					row = i;
					col = j;
				}
			}
		}
		
		bw.write(max+"\n");
		bw.write(row+1 + " ");
		bw.write(col+1+"");
		
		
		br.close();
		bw.close();
	}
}
