class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int Maxlength = nums.length/2;
        int numsLength = nums.length;
        
        int tmp = 0;
        
        for(int i=0; i<nums.length; i++) {
        	tmp = 0;
        	
        	for(int j=i; j<nums.length; j++) {
        		if(nums[i]==nums[j]) tmp++;        		
        	}
        	
        	if(tmp > 1) numsLength--;
        }
        
        if(numsLength >= Maxlength) answer = Maxlength;
        else answer = numsLength;
        
        
        return answer;
    }
}