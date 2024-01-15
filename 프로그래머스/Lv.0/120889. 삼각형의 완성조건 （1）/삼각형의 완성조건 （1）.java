class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = 0;
        int minSum = 0;
        
        for(int i=0; i<sides.length; i++){
            for(int j=i+1; j<sides.length; j++){
                if(sides[i]<sides[j]){
                    int temp = 0;
                    temp = sides[j];
                    sides[j] = sides[i];
                    sides[i] = temp;
                }
            }
        }
        
        return sides[0] < sides[1] + sides[2] ? 1 : 2;
    }
}