import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		while(t>0) {
			bw.write(t+"\n");
			t--;
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
