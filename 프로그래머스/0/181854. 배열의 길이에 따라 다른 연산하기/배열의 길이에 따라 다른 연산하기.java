import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
                
        if(arr.length %2 != 0){
            for(int i=0; i<answer.length; i+=2){
                answer[i] = arr[i] + n;
            }
        } else{
            for(int i=1; i<answer.length; i+=2){
                answer[i] = arr[i] + n;
            }
        }
        
        return answer;
    }
}