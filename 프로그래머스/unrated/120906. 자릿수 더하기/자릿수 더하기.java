class Solution {
    public int solution(int n) {
        int answer = 0;
        
        char[] numArr = (n+"").toCharArray();
        
        for(char c : numArr){
            answer += (int)c - 48;
        }
        
        return answer;
    }
}