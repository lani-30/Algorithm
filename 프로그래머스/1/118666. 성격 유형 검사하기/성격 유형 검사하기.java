import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> count = new HashMap<String, Integer>();
		
		count.put("R", 0);
		count.put("T", 0);
		count.put("C", 0);
		count.put("F", 0);
		count.put("J", 0);
		count.put("M", 0);
		count.put("A", 0);
		count.put("N", 0);
		
		for(int i=0; i<survey.length; i++) {
			
			String x = survey[i].substring(0, 1);
			String y = survey[i].substring(1, 2);
			
			switch(choices[i]) {
			case 1 : count.put(x, count.get(x) + 3 ); break;
			case 2 : count.put(x, count.get(x) + 2 ); break;
			case 3 : count.put(x, count.get(x) + 1 ); break;
			case 4 : break;
			case 5 : count.put(y, count.get(y)+1 ); break;
			case 6 : count.put(y, count.get(y)+2 ); break;  
			case 7 : count.put(y, count.get(y)+3 ); break;
			}
			
		}
		
		String answer = "";
		
		answer += count.get("R") >= count.get("T") ? "R" : "T";
		answer += count.get("C") >= count.get("F") ? "C" : "F";
		answer += count.get("J") >= count.get("M") ? "J" : "M";
		answer += count.get("A") >= count.get("N") ? "A" : "N";
        
        
        
        
        return answer;
    }
}