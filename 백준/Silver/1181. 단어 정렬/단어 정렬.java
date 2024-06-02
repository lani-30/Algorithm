
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int turn = Integer.parseInt(br.readLine());
		
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<turn; i++) {
			set.add(br.readLine());
		}
		
		List<String> list = new ArrayList<String>(set);
		
		Collections.sort(list, new LengthOrder());
		
		for(String s : list) bw.write(s+"\n");
		
		br.close();
		bw.close();
	}
}

class LengthOrder implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		if(o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			
			for(int i=0; i<o1.length(); i++) {
				if(o1.charAt(i) > o2.charAt(i)) {
					return 1;
				} else if(o1.charAt(i) < o2.charAt(i)) {
					return -1;
				}
			}
		}
		
		return 0;
	}
}



