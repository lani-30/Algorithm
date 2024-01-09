class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = ""+a+b;
        String ba = ""+b+a;

        if(Integer.parseInt(ab) > Integer.parseInt(ba)) answer = Integer.parseInt(ab);
        else answer = Integer.parseInt(ba);
        
        
        return answer;
    }
}