class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] myStringArr = my_string.toCharArray();
        
        for(int i=0; i<myStringArr.length; i++){
            for(int j=0; j<n; j++){
                answer += myStringArr[i];
            }
        }
        
        return answer;
    }
}