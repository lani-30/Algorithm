class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int[] answerArr = new int[numlist.length];

        int idx = 0;
        for(int i : numlist){
            if(i % n == 0) {
                answerArr[idx] = i;
                idx++;
            }
        }
        
        int[] answer = new int[idx];
        idx = 0;
        for(int i : answerArr){
            if(i!=0){
                answer[idx] = i;
                 idx++;
            }        
        }
                
        return answer;
    }
}