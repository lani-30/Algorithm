
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int days = Integer.parseInt(br.readLine());
		int kor = Integer.parseInt(br.readLine());
		int math = Integer.parseInt(br.readLine());
		int dayKor = Integer.parseInt(br.readLine());
		int dayMath = Integer.parseInt(br.readLine());
		
		int work = Math.max(
				kor % dayKor == 0 ? kor/dayKor : kor/dayKor+1 , 
				math % dayMath == 0 ? math/dayMath : math/dayMath+1);
		
		bw.write(days-work+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
