import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>0; i--) {

			for(int j = i-1; j > 0; j--) {
				bw.write(" ");
			}

			for(int x=0; x < (n-i)+1; x++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		bw.close();
	}

}