
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10000];
		
		for(int i=1; i<=10000; i++) {
			int idx = dn(i) - 1;
			
			if(idx < 10000) arr[idx] += 1;
		}
		
		for(int i=0; i<10000; i++) {
			if(arr[i] == 0) bw.write(i+1+"\n");
		}
		
		bw.flush();
		bw.close();
	}

	
	private static int dn(int n) {
		
		int res = n;
		int answer = n;
		
		for(int i=10000; i>0; i/=10) {
			
			if(res / i > 0) {
				answer += res / i;
				res -= (res / i) * i;
			}
		}
		
		return answer;
	}
	
}