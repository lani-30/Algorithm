
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num1 = st.nextToken();
		String num2 = st.nextToken();
		
		StringBuffer bfNum1 = new StringBuffer(num1);
		num1 = bfNum1.reverse().toString();

		StringBuffer bfNum2 = new StringBuffer(num2);
		num2 = bfNum2.reverse().toString();

		StringBuffer bfAnswer = new StringBuffer(String.valueOf((Integer.parseInt(num1) + Integer.parseInt(num2)))); 
		bfAnswer = bfAnswer.reverse(); 
		
		bw.write(Integer.parseInt(bfAnswer.toString())+"");
		
		br.close();
		bw.close();
	}
}


