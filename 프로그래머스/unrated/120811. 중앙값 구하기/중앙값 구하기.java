class Solution {
    public int solution(int[] array) {    
        
        int tmp = 0;
        
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j] > array[i]){
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
                
        return array[array.length/2];
    }
}