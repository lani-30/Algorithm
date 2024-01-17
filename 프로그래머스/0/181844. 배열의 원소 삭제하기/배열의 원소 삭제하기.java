import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
                
        List<Integer> answer = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for (int i : delete_list) {
			
			int index = answer.indexOf(i);
			if(index != -1) {
				answer.remove(index);
			}
			
		}
        
        int[] answerArr = answer.stream().mapToInt(Integer::intValue).toArray(); 
        
        return answerArr;
    }
}