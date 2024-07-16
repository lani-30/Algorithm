
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			map.put(Integer.parseInt(st.nextToken()),1);
		}
		
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			bw.write(map.containsKey(Integer.parseInt(st2.nextToken())) ? "1\n" : "0\n");  
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
