class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String numbers = "";
		
		for(int num = i; num <= j; num++) {
			numbers += num+"";
		}
		String[] numberArr = numbers.split(k+"");
					
		String js = j+"";
		
        return js.endsWith((k+"")) ? numberArr.length : numberArr.length-1;
    }
}