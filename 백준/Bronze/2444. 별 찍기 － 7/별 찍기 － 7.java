
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int t = num-1;
		int star = 1;
		
		for(int i=0; i<num; i++) {

			for(int j=t; j>0; j--) bw.write(" ");
			
			for(int s=0; s<star; s++) bw.write("*");
			
			bw.write("\n");
			
			t--;
			star+=2;
		}
		
		t++;
		star-=2;
		
		for(int i=0; i<num-1; i++) {
			
			t++;
			star-=2;
			
			for(int j=t; j>0; j--) bw.write(" ");
			
			for(int s=0; s<star; s++) bw.write("*");
			
			bw.write("\n");
		}
		
		br.close();
		bw.close();
	}
}



