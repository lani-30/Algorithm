
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int num = 0;
		
		while(true) {
			if(String.valueOf(num).contains("666")) {
				t--;
				if(t==0) break;
			}
			
			num++;
		}
		
		bw.write(num+"");
		
		
		br.close();
		bw.close();
	}
}
