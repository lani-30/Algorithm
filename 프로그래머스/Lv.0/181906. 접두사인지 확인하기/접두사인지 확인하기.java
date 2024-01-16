class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() >= is_prefix.length()) {
			my_string = my_string.substring(0, is_prefix.length());
		}
        return my_string.compareTo(is_prefix) == 0? 1 : 0;
    }
}