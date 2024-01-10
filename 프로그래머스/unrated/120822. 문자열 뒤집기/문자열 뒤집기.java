class Solution {
    public String solution(String my_string) {
        
        char[] arr = new char[my_string.length()];
        int idx=my_string.length()-1;
        
        for(char c : my_string.toCharArray()){
            arr[idx] = c;
            idx--;
        }
        
        String answer = new String(arr);
               
        return answer;
    }
}