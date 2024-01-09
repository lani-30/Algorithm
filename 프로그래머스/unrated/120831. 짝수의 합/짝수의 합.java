class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i<n; i++){
            if((n-i)%2==0){
                answer += n-i;
            }
        }
        
        return answer;
    }
}