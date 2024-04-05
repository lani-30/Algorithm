
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int compare = num;
		int sum = 0;
		int last = 0;
		int i = 0;
		
		do {
	
			// 제시된 수의 합
			last = num%10;
			sum = num/10 + last;
			
			sum = last*10 + sum%10;
			
			num = sum;
			i++;
			
		} while (sum != compare);
		
		bw.write(i+"");
		
		br.close();
		bw.close();
	}
}
