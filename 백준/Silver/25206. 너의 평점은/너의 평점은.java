
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Double> gradeMap = new HashMap<String, Double>();
		gradeMap.put("A", 4.0);
		gradeMap.put("B", 3.0);
		gradeMap.put("C", 2.0);
		gradeMap.put("D", 1.0);
		gradeMap.put("F", 0.0);
		
		double sum = 0;
		double gradeSum = 0;
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			double points = Double.parseDouble(st.nextToken()); // 학점
			String grade = st.nextToken(); // 등급
			
			if(grade.equals("P")) continue;
			
			double gradeAverage = 0.0;
			gradeAverage += gradeMap.get(grade.charAt(0)+"");
			if(grade.length() > 1 && grade.charAt(1) == '+') gradeAverage += 0.5;
			
			sum += points * gradeAverage;
			gradeSum += points;
		}
		
		bw.write(String.format("%.6f", sum/gradeSum));
		
		br.close();
		bw.close();
	}
}