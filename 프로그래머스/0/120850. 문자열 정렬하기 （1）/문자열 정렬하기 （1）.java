import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String subString = "";
	        
	        for(int i=0; i<my_string.length(); i++){
	            if(my_string.charAt(i) < 58){
	                subString += my_string.charAt(i);
	            }
	        }
	        
	        System.out.println(subString);
	        
	        int[] answer = new int[subString.length()];
	        
	        for(int i=0; i<subString.length(); i++){
	            answer[i] = subString.charAt(i) - '0';
	        }
        
        Arrays.sort(answer);
        
        
        return answer;
    }
}