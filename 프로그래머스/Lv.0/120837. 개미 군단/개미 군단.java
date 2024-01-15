class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count3 = 0;
        answer = hp/5;
                
        if(hp%5 != 0){
            hp -= (5*answer);
            answer += hp/3;
            count3 = hp/3;
            
            if(hp%3 != 0){
                hp -= (3*count3);
                answer += hp;
            }            
        }
        
        return answer;
    }
}