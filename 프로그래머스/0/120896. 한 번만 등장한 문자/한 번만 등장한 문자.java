import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";        
        int num = 0;
        
        for(int i=0; i<s.length(); i++) {        	
        	num=0;
        	
        	for(int j=0; j<s.length(); j++) {
        		if( ((s.charAt(i)+"").equals((s.charAt(j)+""))) ) num++;
        	}
        	
        	if(num == 1) answer += s.charAt(i)+""; 
        }
		
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        
        answer = new String(charArr);
        
        return answer;
    }
}