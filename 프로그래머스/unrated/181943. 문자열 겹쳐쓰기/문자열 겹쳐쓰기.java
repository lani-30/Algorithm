class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
		String answer="";
		char[] charArr = my_string.toCharArray();
		
		for(int i = 0; i < overwrite_string.length(); i++) {
			charArr[s+i] = overwrite_string.toCharArray()[i];
		}
        
        answer += new String(charArr);
        
        return answer;
    }
}