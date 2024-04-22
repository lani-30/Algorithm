
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int num11 = (num1%10 * 100) + (num1%100 - num1%10) + (num1/100);
		int num22 = (num2%10 * 100) + (num2%100 - num2%10) + (num2/100);
		
		bw.write(Math.max(num11, num22)+"");
		
		br.close();
		bw.close();
	}
}