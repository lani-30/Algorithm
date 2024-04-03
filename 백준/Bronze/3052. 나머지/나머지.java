import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num % 42);
		}
		
		for(int i=0; i<list.size(); i++) {

			for(int j=i+1; j<list.size(); j++) {
				
				if(list.get(i) == list.get(j)) {
					list.remove(j);
					j--;
				}
			}
		}
		
		bw.write(list.size()+"");
		
		br.close();
		bw.close();
	}
}