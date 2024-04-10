
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
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		int max = 0;
		double answer = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			max = Math.max(max, arr[i]);
		}
		
		for(int i=0; i<num; i++) {
			answer += (double)arr[i]/max*100;
		}
		
		bw.write(answer/num+"");
		
		br.close();
		bw.close();
	}
}