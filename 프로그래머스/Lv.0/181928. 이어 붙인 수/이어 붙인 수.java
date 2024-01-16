class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a =""; // 짝수
        String b =""; // 홀수
        
        for(int i:num_list){
            if(i%2==0) a+= i+"";
            else  b+= i+"";
        }
                        
        return Integer.valueOf(a) + Integer.valueOf(b);
    }
}