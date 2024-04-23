
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		int sum = 0;
		int idx=1;
		
		for(int i=1; i<=1000; i++) {
			for(int j=1; j<=i; j++) {
				if(idx >= s && idx <= e) {
					sum += i;
				}
				idx++;
			}
		}
		
		bw.write(sum+"");
		
		br.close();
		bw.close();
	}
}
