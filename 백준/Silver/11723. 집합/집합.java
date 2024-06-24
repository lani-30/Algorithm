

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>(Collections.nCopies(21, 0));
		
		while(t>0) {
			
			String str = br.readLine();
			
			if(!str.contains(" ")) {
				switch(str) {
				case "all" : Collections.fill(list, 1);	break;
				case "empty" : Collections.fill(list, 0); break;
				}
			}
			
			else {
				StringTokenizer st = new StringTokenizer(str);
				String str2 = st.nextToken();
				int idx = Integer.parseInt(st.nextToken());
				
				switch(str2) {
				case "add" : list.set(idx, 1); break;
				case "remove" : list.set(idx, 0); break;
				case "toggle" : list.set(idx, list.get(idx) == 0? 1 : 0); break;
				case "check" : bw.write(list.get(idx)+"\n"); break;
				}
			}
			t--;
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}




