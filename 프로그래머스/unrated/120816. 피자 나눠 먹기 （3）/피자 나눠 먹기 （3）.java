class Solution {
    public int solution(int slice, int n) {
        int answer = n/slice;

        if(answer*slice < n){
            answer++;
        }
        
        return answer;
    }
}