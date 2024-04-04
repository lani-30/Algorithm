
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		List<Integer> numbers = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int i = 0;
		
		do numbers.add(Integer.parseInt(st.nextToken()));
		while(++i<num);
		
		// array 오름차순으로 정렬
		Collections.sort(numbers);
		
		if(num > 1) {
			// 제일 작은 수와 제일 끝 수를 곱함
			bw.write(numbers.get(0) * numbers.get(num-1) + "");
			
		} else {
			// 만약 array가 1이라면 해당 수를 두 번 곱함
			bw.write(numbers.get(0)*numbers.get(0)+"");
		}
		
		br.close();
		bw.close();
	}
}