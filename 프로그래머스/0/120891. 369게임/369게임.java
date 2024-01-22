class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderNumbers = String.valueOf(order);
        
        for(int i=0; i<orderNumbers.length(); i++){

	        	if(orderNumbers.charAt(i) == (char)(3+'0') || 
	        			orderNumbers.charAt(i) == (char)(6+'0') ||
	        			orderNumbers.charAt(i) == (char)(9+'0'))
	             answer++;
	        }

        
        return answer;
    }
}