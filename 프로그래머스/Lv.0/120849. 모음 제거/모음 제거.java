class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char c : my_string.toCharArray()){
           if(c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
               answer += "";
           } else {
               answer += Character.toString(c);
           }
        }
        
        
        return answer;
    }
}