
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > 0) stack.add(num);
			else stack.pop();
		}
		
		int sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		
		bw.write(sum+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}