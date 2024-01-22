import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int check = 0;
        
        char[] beforeArr = before.toCharArray();
        Arrays.sort(beforeArr);
        
        char[] afterArr = after.toCharArray();
        Arrays.sort(afterArr);
        
        for(int i=0; i<beforeArr.length; i++) {
        	if(!(beforeArr[i]==afterArr[i])) return 0;
        }
        
        return 1;
    }
}