
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) queue.add(i);
		
		while(queue.size() > 1) {
			queue.remove();
			int n = queue.poll();
			queue.add(n);
		}
		
		bw.write(queue.peek()+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}


