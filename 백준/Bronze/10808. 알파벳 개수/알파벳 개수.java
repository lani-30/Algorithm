
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] abc = new int[26];
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			abc[str.charAt(i) - 97]++;
		}
		
		for(int i:abc) bw.write(i+" ");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
