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
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = i+1;
		
		for(int i=0; i<m; i++) {
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st2.nextToken()) -1;
			int y = Integer.parseInt(st2.nextToken()) -1;
			
			int temp=0;
			
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		
		for(int i : arr) bw.write(i+" ");
		
		br.close();
		bw.close();
	}
}
