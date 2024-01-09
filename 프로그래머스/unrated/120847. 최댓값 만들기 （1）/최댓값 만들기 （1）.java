class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
      int tmp = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		if(numbers[j] > numbers[i]) {
        			tmp = numbers[j];
        			numbers[j] = numbers[i];
        			numbers[i] = tmp;
        		}
        	}
        }
               
        return numbers[0] * numbers[1];
    }
}