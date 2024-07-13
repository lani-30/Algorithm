
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		int answer = 0;
		for(int i=list.size()-1; i>=0; i--) {
			int sum = 0;
			for(int j=i; j>=0; j--) {
				sum += list.get(j);
			}
			answer += sum;
		}
		
		bw.write(answer+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}