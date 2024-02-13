import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        // moves를 순서대로 돌리면서
		// board의 전체 행 중 첫번째로 0이 아닌 moves열의 숫자를 0으로 치환함. 해당 숫자는 crain에 저장
		// crain 저장이 끝나면 앞 순서부터 바로 뒤에와 숫자가 같은지, 0이 아닌지 확인하고, 같으면 둘 다 0로 바꾸고
		// answer에 +1
        
        int answer = 0;
        List<Integer> crain = new ArrayList<Integer>();		
		
		for(int i=0; i<moves.length; i++) {
			
			for(int j=0; j<board.length; j++) {
				
				if(board[j][moves[i]-1] != 0) {
					int tmp = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					crain.add(tmp);
					break;
					
				} 
			}
		}
		
	    for(int i=0; i<crain.size(); i++) {
			
			for(int j=i+1; j<crain.size(); j++) {
				
				if(crain.get(i) == crain.get(j)) {
					answer+=2;
					crain.remove(j);
					crain.remove(i);
					
					i = -1;
					break;
					
				} else break;
			}
		}
		
        
        return answer;
    }
}