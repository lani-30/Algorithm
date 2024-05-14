
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] abcArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = br.readLine();
		int answer = 0;
		
		for(int i=0; i<abcArr.length; i++) {
			if(str.contains(abcArr[i])) {
				answer++;
				str = str.replaceFirst(abcArr[i], ",");
				i--;
			}
		}
		
		str = str.replaceAll(",", "");
		answer += str.length();
			
		bw.write(answer+"");
		
		br.close();
		bw.close();
	}
}