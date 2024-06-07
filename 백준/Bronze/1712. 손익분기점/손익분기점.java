import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int staticM = Integer.parseInt(st.nextToken());
		int oneM = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		int answer = (price - oneM);
		
		if(answer <= 0) bw.write(-1+"");
		else bw.write(staticM / answer+1+"");
		
		br.close();
		bw.close();
	}
	
}




