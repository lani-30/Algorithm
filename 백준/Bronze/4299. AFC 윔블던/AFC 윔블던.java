
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken());
		int cha = Integer.parseInt(st.nextToken());
		
		int a = sum/2;
		int b = sum/2;
		
		if(sum % 2 != 0) a += 1;
		
		boolean flag = false;
		
		while(true) {
			
			if(b<0) {
				flag = true;
				break;
			}
			
			if(a-b == cha) break;
			
			a++;
			b--;
		} 
		
		if(flag) bw.write(-1 + "");
		else bw.write(a + " " + b);
			
		
		bw.flush();
		br.close();
		bw.close();
	}
}




