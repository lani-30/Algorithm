class Solution {
    public int solution(String message) {
        int answer = 0;
        int num = 0;
        for(char c : message.toCharArray()){
            num++;
        }
        
        return num * 2;
    }
}