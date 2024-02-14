import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List<String> wordsArr = new ArrayList<String>();
		
		int idx = -1;
		
		// 같은 단어가 언제 나오는지 확인
		for(int i=0; i<words.length; i++) {
			if(!wordsArr.contains(words[i])) {
				wordsArr.add(words[i]);
			} else {
				idx = i;
				break;
			}
		}
		
		// 앞 단어의 마지막 글자와 다음 단어의 첫번째 글자가 같은지 확인
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++) {
				if(words[i].charAt(words[i].length()-1) != words[j].charAt(0)) {
					if(idx != -1) {
						idx = j < idx ? j : idx;
					} else idx = j;
				} else break;
			}
		}
		
		if(idx == -1) {
			answer[0] = 0; answer[1] = 0; 
            return answer;
		} else idx += 1;
        
        // 해당 단어가 있는 곳까지 사람 수대로 잘라서 배열을 만든다
        // 해당 배열 안에서 단어가 몇번째에 있는지 확인(틀린 사람)
		
		if(idx % n == 0) {
			answer[0] = n; answer[1] = idx / n; 
		}
		else {
			answer[0] = idx%n; answer[1] = idx / n + 1; 
		}

        
        return answer;
    }
}