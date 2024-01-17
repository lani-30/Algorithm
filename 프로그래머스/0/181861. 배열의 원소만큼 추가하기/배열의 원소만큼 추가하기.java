class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int i : arr) length += i;        
        int[] answer = new int[length];
        
        int idx = 0;
        
        for(int i:arr){
            for(int j = 0; j<i; j++){
                answer[idx] = i;
                idx++;
            }
        }
        
        return answer;
    }
}