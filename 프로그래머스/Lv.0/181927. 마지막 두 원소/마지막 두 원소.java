class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length +1];
        // 배열 복사        
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        // 마지막 인덱스 체크
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else{
            answer[answer.length-1] = num_list[num_list.length-1] *2;
        }

        return answer;
    }
}