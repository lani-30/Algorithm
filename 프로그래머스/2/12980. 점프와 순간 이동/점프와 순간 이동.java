import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

       do {
			
			if(n%2 == 0) n /= 2;
			else {
				n -=1;
				ans++;
			}
			
		} while(n!=0);
        
        
        return ans;
    }
}