class Solution {
    public String solution(String bin1, String bin2) {
                
        int bin11 = Integer.parseInt(bin1, 2);
		int bin22 = Integer.parseInt(bin2, 2);
		
		String answer = Integer.toBinaryString(bin11+bin22);
        
        return answer;
    }
}