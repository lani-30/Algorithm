
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		int answer = 0;

		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n.length(); i++) list.add(n.charAt(i)-'0');
		
		while(list.size() != 0) {
			Set<Integer> set = new HashSet<Integer>();
			
			for(int i=0; i<list.size(); i++) {
				
				Boolean rs = false;
				
				switch(list.get(i)) {
				
				case 6 : 
					if(set.contains(6)) rs = set.add(9);
					else rs = set.add(6);
					break;
					
				case 9 : 
					if(set.contains(9)) rs = set.add(6);
					else rs = set.add(9);
					break;
				
				default : 
					rs = set.add(list.get(i));
				}
				
				if(rs) {
					list.remove(i);
					i--;
				}
			}
			answer++;
		}
		
		// list.remove(0); // list.remove시 index 순서를 땡겨옴.
		
		bw.write(answer+"");
		
		
		
		br.close();
		bw.close();
	}
}

