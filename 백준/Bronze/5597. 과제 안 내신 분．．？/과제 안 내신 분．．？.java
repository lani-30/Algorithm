
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
		
		int[] arr = new int[30];
		
		for(int i=0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			
			arr[n-1] = n;
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i]==0) bw.write(i+1 +"\n");
		}
		
		
		br.close();
		bw.close();
	}
}
