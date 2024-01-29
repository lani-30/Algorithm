import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] answer = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
		Arrays.sort(answer, Collections.reverseOrder());
		
		for(int i:answer) System.out.println(i);
		
		for(int i=0; i<answer.length; i++) {
			
			for(int j=0; j<answer.length; j++) {
				if(emergency[i] == answer[j]) {
					emergency[i] = j+1;
                    break;
				}
			}
		}
        return emergency;
    }
}