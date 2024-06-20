
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		List<Map<String, Integer>> dungchiList = new ArrayList<Map<String,Integer>>();
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			map.put("height", Integer.parseInt(st.nextToken()));
			map.put("weight", Integer.parseInt(st.nextToken()));
			
			dungchiList.add(map);
		}
		
		
		// 큰 리스트가 돌면서 순서를 정하고, 그 순서를 순서 list에 저장한다.
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<t; i++) {
			
			int biggerMan = 0;
			
			for(int j=0; j<t; j++) {
				
				if( dungchiList.get(i).get("height") < dungchiList.get(j).get("height") &&
					dungchiList.get(i).get("weight") < dungchiList.get(j).get("weight")) {
					biggerMan++;
				}
			}
			
			list.add(biggerMan+1);
		}
		
		for(int i:list) bw.write(i + " ");
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}

