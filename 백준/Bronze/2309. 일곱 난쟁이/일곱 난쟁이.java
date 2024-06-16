
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			list.add(Integer.parseInt(br.readLine()));
			sum += list.get(i);
		}
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j < 9; j++) {
				if(sum - list.get(i) -list.get(j) == 100) {
					list.remove(i);
					list.remove(j-1);
					
					Collections.sort(list);
					
					for(int h:list) bw.write(h+"\n");
					
					break;
				}
			}
			
			if(list.size() != 9) break;
		}
			
		bw.flush();
		br.close();
		bw.close();
	}
}

