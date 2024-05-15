
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		sb = sb.reverse();
		
		if(str.equals(sb.toString())) bw.write(1+"");
		else bw.write(0+"");
		
		br.close();
		bw.close();
	}
}