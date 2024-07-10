
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// push : 값 넣음 , pop : 최근 값 삭제, peek : 최근 값 출력, search(n) : n의 인덱스 출력, empty : T/F
		
		// for문 돌리고
		// 문자열을 char로 하나씩 꺼내서
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			Stack<String> stack = new Stack<>();
			String vps = br.readLine();
			Boolean flag = false;
			
			for(int j=0; j<vps.length(); j++) {
				
				if(vps.charAt(j) == '(') stack.push("a");
				else {
					if(stack.empty()) {
						flag = true;
						break;
					}
					
					if(flag) break;
					stack.pop();
				}
			}
			
			if(!stack.empty() || flag) bw.write("NO\n");
			else bw.write("YES\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}


