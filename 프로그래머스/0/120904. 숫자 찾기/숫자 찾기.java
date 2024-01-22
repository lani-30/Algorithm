class Solution {
    public int solution(int num, int k) {
        
        String numbers = Integer.toString(num);
        
        for(int i=0; i<numbers.length(); i++){
            if(numbers.charAt(i) == (char)(k + '0')){
                return i+1;
            }
        }
        
        int answer = -1;
        
        
        
        return answer;
    }
}