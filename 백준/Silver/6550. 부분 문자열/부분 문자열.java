

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		
		while((str = br.readLine()) != null) {
			
			StringTokenizer st = new StringTokenizer(str);
			
			String s = st.nextToken();
			String t = st.nextToken();
			
			int index = 0;
			
			boolean flag = true;
			
			for(int i=0; i<s.length(); i++) {
				flag = false;
				
				for(int j=index; j<t.length(); j++) {
					if(s.charAt(i) == t.charAt(j)) {
						flag = true;
						index = j+1;
						break;
					}
				}
				
				if(!flag) break;
			}
			
			if(flag) bw.write("Yes\n");
			else bw.write("No\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}




