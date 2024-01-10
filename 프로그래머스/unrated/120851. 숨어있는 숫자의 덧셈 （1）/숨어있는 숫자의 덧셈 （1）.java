class Solution {
    public int solution(String my_string) {
        String answer = my_string.replaceAll("[^\\d]","");
        
        int[] intArr = new int[answer.length()];
        for(int i = 0; i<answer.length(); i++){
            intArr[i] = answer.charAt(i)-'0';
        }
        
        int answer2 = 0;
        for(int i : intArr){
            answer2 += i;
        }
        
        
        return answer2;
    }
}