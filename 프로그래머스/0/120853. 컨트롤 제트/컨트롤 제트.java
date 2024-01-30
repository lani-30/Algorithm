class Solution {
    public int solution(String s) {
        int answer = 0;
        
       String[] sArr = s.split(" ");
		
		for(int i=0; i<sArr.length; i++) {
			
			if(sArr[i].equals("Z")) {
				answer -= Integer.valueOf(sArr[i-1]);
			} else {
				answer += Integer.valueOf(sArr[i]);
			}
		}
		
        
        return answer;
    }
}