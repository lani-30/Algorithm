
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = {1,1,2,2,2,8};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			
			bw.write(arr[i] - Integer.parseInt(st.nextToken())+" ");
			
		}
		
		br.close();
		bw.close();
	}
}
