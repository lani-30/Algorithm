
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int answer = t;
		
		for(int i=0; i<t; i++) {
			
			String str = br.readLine();
			
			if(str.length()==0) {
				answer++;
				continue;
			}			
			
			// 포함된 글자들로만 이루어진 배열 만들기
			Set<String> set =  new HashSet<String>();
			for(char c : str.toCharArray()) set.add(String.valueOf(c));
			List<String> strList = new ArrayList<String>(set);
						
			
			for(int x=0; x<strList.size(); x++) {
				
				boolean flag = false;
				int a=-1; int b=-1;
				
				for(int y=0; y<str.length(); y++) {

					if(strList.get(x).equals(String.valueOf(str.charAt(y)))){
						if(a > -1) b = y;
						else a = y;
					}
					
					if(a > -1 && b > -1) {
						if(b-a > 1) {
							flag = true;
							break; 
						}
						
						a=b;
						b=-1;
					}
					
				}
				
				if(flag) {
					answer--;
					break;
				}
			}
		}
		
		
		
		bw.write(answer+"");
		
		
		
		br.close();
		bw.close();
	}
}