
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int times = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for(int s=0; s<str.length(); s++) {
				for(int r=0; r<times; r++) {
					bw.write(str.charAt(s));
				}
			}
			
			bw.write("\n");
			
		}
		
		br.close();
		bw.close();
	}
}




