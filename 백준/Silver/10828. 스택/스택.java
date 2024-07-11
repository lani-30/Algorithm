
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// push : 값 넣음 , pop : 최근 값 삭제, peek : 최근 값 출력, search(n) : n의 인덱스 출력, empty : T/F
		
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int value = 0;
			
			if(st.hasMoreTokens()) value = Integer.parseInt(st.nextToken());
			
			switch(order) {
			case "push" : stack.push(value); break;
			case "pop" : bw.write(!stack.empty()? stack.pop()+"\n" : "-1\n"); break;
			case "size" : bw.write(stack.size()+"\n"); break;
			case "empty" : bw.write(stack.empty() ? "1\n" : "0\n"); break;
			case "top" : bw.write(stack.empty() ? "-1\n" : stack.peek()+"\n"); break;
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
