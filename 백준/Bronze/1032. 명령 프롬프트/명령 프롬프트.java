
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int turn = Integer.parseInt(br.readLine());
		String[] arr = new String[turn];
		for(int i=0; i<turn; i++) arr[i] = br.readLine();
		
		boolean flag = false;
		String answer = "";
		int idx = 0;
		
		// 1. 글자들이 모두 같은지, 다른지
		for(int i=0; i<turn; i++) {
			for(int j=i+1; j<turn; j++) {
				
				if(!arr[i].equals(arr[j])) {
					flag = true;
				}
			}
		}
		
		if(!flag) bw.write(arr[0]);
		else {

			// 2. 인덱스별로 돌아가면서, 글자들의 모양이 같으면 String에 +, 다르면 ? +
			for(int i=0; i<arr[0].length(); i++) {
				
				flag = true;
				char c = arr[0].charAt(i);

				for(int j=0; j<turn; j++) {
					
					if(arr[j].charAt(i) != c) {
						answer += "?";
						flag = false;
						break;
					}
				}
						
				if(flag) {
					answer += arr[0].charAt(i)+""; 
				}
			}
			
			bw.write(answer);
		}
		
		br.close();
		bw.close();
	}
}