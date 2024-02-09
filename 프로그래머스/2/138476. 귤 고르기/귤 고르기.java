import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> kindMap = new HashMap<Integer, Integer>();
		
		for(int i:tangerine) {
			if(!kindMap.containsKey(i)) kindMap.put(i, 1);
			else kindMap.put(i, kindMap.get(i)+1);
		}		
		
		int[] keys = new int[kindMap.size()];		
		int idx = 0;
		
		for(int i:kindMap.values()) {
			keys[idx] = i;
			idx++;
		}
		
		Integer[] keys2 = Arrays.stream(keys).boxed().toArray(Integer[]::new);
		Arrays.sort(keys2, Collections.reverseOrder());		
				
		int count = 0;
		int answer = 0;
		
		for(int i=0; i<keys2.length; i++) {			
			if(count >= k) {
				break;
			}
            
            count += keys2[i];
            answer = i+1;
		}
        
        return answer;
    }
}