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

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(br.readLine());
		
		int num = 0;
		
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(st.nextToken()) == find) ++num;
		}
		
		bw.write(num+"");
		
		br.close();
		bw.close();
	}
}
