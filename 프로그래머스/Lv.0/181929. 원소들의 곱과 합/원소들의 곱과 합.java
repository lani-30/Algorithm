class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int plus = 0;
        int multi = 1;
        
        for(int i : num_list){
            plus += i;
            multi *= i;
        }
        
        return multi < plus*plus ? 1 : 0;
    }
}