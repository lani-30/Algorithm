class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        
		String arrays = "";
		
		for(int i : array) arrays += i+"";
		
		for(char c : arrays.toCharArray()) {
			if(c == '7') answer++;
		}
        return answer;
    }
}