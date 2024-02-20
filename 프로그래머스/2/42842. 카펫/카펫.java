class Solution {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = new int[2];
        
        int div = (brown + yellow)/2;
        
        for(int i=div-1; i>=2; i--) {
        	if((brown+yellow) % i == 0 &&
        			(i*2 + (((brown+yellow) / i -2)*2) == brown)) {
        		answer[0] = i;
        		answer[1] = (brown+yellow) / i;
        		
        		break;
        	}
        }
		
        
        return answer;
    }
}