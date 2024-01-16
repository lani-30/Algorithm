import java.util.Collections;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int num = 0;
		for(int i=0; i < todo_list.length; i++){
			if(!finished[i]) num++;
        }
		
		String[] answer = new String[num];
			
		num = 0;
		for(int i=0; i < todo_list.length; i++){
			if(!finished[i]) {
				answer[num] = todo_list[i];
				num++;
			}
		}
        
        return answer;
    }
}