class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;        
        
        for (int i = 1; sum <= n; i++) {

            sum = 1;
            
			for (int j = i; j >= 1; j--) {
				sum *= j;
			
			}
			
			answer = i;
			
		}
        
        if(sum>n) answer -= 1;
        
        return answer;
    }
}