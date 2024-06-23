

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		String[][] strArr = new String[t][2];
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			strArr[i][0] = st.nextToken();
			strArr[i][1] = st.nextToken();
		}
		
		Arrays.sort(strArr, new Comparator<String[]>() {
			
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			};
		});
		
		
		for(int i=0; i<t; i++) {			
			bw.write(strArr[i][0]+" "+strArr[i][1]+"\n");
		}
				
		
		bw.flush();
		br.close();
		bw.close();
	}
}




