class Solution {
    public String solution(String my_string) {       
        
        String answer = "";
        
        for(char c : my_string.toCharArray()) {
            if((int)c < 97) {
                c = Character.toLowerCase(c);
                answer += c;
            } else {
                c = Character.toUpperCase(c);
                answer += c;
            }
        }
        
        
        return answer;
    }
}