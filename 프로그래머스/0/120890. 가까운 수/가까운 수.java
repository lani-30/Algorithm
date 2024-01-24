class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;        
        int value = 100000;
			
		int[] arrays = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			arrays[i] = Math.abs(array[i]-n); 
		}
		
		for(int i =0; i<arrays.length; i++) {
			if(arrays[i] < value) {
				value = arrays[i]; 
				answer = array[i];
				
			} else if(arrays[i] == value) {
				if(array[i] < array[i-1]) answer = array[i];
				else answer = array[i-1];
			}
		}
        
        return answer;
    }
}