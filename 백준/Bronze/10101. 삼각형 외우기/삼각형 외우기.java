
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if(a + b+ c != 180) bw.write("Error");
		else {
			if(a == b && b == c) bw.write("Equilateral");
			else if(a == b || b == c || a == c) bw.write("Isosceles");
			else bw.write("Scalene");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
