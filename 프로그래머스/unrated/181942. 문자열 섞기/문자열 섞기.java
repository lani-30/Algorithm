class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		for(int i = 0; i < str1Arr.length; i++) {
			for(int j = i; j<=i; j++) {
				answer += str1Arr[i];
				answer += str2Arr[j];
			}
		}
        
        
        return answer;
    }
}