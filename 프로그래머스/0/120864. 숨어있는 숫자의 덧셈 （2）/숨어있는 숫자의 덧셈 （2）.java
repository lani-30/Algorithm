class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] stringArr = my_string.split("[A-z]");
	        
	        for(String s : stringArr) {
	        	if(!s.equals("")) {
	        		System.out.println(s);
	        		answer+= Integer.valueOf(s);
	        	}
	        }
        
        return answer;
    }
}