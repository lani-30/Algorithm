
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int num = 0;
			if(st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());
			
			switch(order) {
			case "push" : stack.push(num); break;
			case "pop" :  bw.write((stack.isEmpty() ? -1 : stack.get(0))+"\n");
			if(!stack.isEmpty()) stack.remove(0); break;
			case "size" : bw.write(stack.size()+"\n"); break;
			case "empty" : bw.write((stack.isEmpty()? 1 : 0)+"\n"); break;
			case "front" : bw.write((stack.isEmpty()? -1 : stack.firstElement())+"\n"); break;
			case "back" : bw.write((stack.isEmpty()? -1 : stack.lastElement())+"\n"); break;
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}