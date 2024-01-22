class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 0; // 약수 갯수
        
        for (int i = 1; i <= n; i++) {
			
			number = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					number++;
				}
			}


			if (number >= 3) answer++;
		}
        
        return answer;
    }
}