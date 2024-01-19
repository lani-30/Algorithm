import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int num = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				num++;
		}

		int[] answer = new int[num];

		num = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer[num] = i;
				num++;
			}
		}

		Arrays.sort(answer);
        
        return answer;
        
    }
}