class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()){
            if(c<97) {
                answer += c;
            }else{
                c = Character.toUpperCase(c);
                answer += c;
            }
        }
        
        return answer;
    }
}