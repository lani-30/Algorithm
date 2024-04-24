
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		boolean flag;
		
		for(int i=0; i<26; i++) {
			
			flag = false;
			
			for(int s=0; s<str.length(); s++) {
				if((char)(97+i) == str.charAt(s)) {
					bw.write(s+" ");
					flag=true;
					break;
				}
			}
			
			if(!flag) bw.write(-1+" ");
		}
		
		br.close();
		bw.close();
	}
}