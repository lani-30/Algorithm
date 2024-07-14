
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			if(K / list.get(i) <= 0) {
				continue;
			}
			
			int t = K / list.get(i);
			answer += t;
			K -= t * list.get(i);
		}
		
		bw.write(answer+"");
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}