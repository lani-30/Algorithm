class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer;
        
        if(eq.equals("!")){
           if(ineq.equals(">")){
               answer = n > m;
           } else answer = n < m;
        } else{
            if(ineq.equals(">")){
               answer = n >= m;
           } else answer = n <= m;
        }
        
        if(answer){
            return 1;
        } else{
            return 0;
        }
        
        
    }
}