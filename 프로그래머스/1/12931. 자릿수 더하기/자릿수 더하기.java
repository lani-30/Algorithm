import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=100000000; i*=10){          
            
            int sum = n/(100000000/i);             
            answer += sum;     
            n -= (sum * (100000000/i));
            
        }

    
        return answer;
    }
}