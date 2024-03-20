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

		st = new StringTokenizer(br.readLine());
		
		int min = 1000001;
		int max = -1000001;
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if( min > x ) min = x; 
			if( max < x ) max = x;			
		}
		
		bw.write(min + " " + max);
		
		br.close();
		bw.close();
	}
}
