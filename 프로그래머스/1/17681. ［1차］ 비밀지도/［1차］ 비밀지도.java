class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] arr1Binary = new String[arr1.length];
        String[] arr2Binary = new String[arr2.length];
        
        for(int i=0; i<arr1.length; i++) {
        	arr1Binary[i] = Integer.toBinaryString(arr1[i]);
        	arr2Binary[i] = Integer.toBinaryString(arr2[i]);
        	
        	if(arr1Binary[i].length() < n) {
        		int minusLength = n - arr1Binary[i].length();
        		for(int j=0; j < minusLength; j++) arr1Binary[i] = "0"+arr1Binary[i]; 
        	}
        	
        	if(arr2Binary[i].length() < n) {
        		int minusLength = n - arr2Binary[i].length();
        		for(int j=0; j < minusLength; j++) arr2Binary[i] = "0"+arr2Binary[i];
        	}
        }
        
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
        	
        	answer[i] = "";
        	
        	for(int j=0; j<n; j++) {
        		if(arr1Binary[i].charAt(j) == '1' || arr2Binary[i].charAt(j) == '1' ) {
            		answer[i]+="#";
            	} else {
            		answer[i]+=" ";
            	}
        	}
        }
              
        
        return answer;
    }
}