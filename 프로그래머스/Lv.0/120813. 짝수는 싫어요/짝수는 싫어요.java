class Solution {
    public int[] solution(int n) {
        
	        int idx = 0;
	        for(int i=0; i<n; i++){
	            if((n-i)%2 != 0) idx++;
	        }
	        
	        int[] answer = new int[idx];
	        
	        idx = 0;
	        
	        for(int i = 1; i<=n; i+=2) {
	        	if(i <= n) answer[idx] = i; 
	        	idx++;
	        }
        
        return answer;
    }
}