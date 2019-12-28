// https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
	/*
		clarifying questions & edge cases:
            pay attention to trailing and leading spaces
		test: 
		
		algorithm:
            read string backwards, buffer for the word and append that word to result
		
        n: string length
		time complexity: O(n)
		space complexity: O(n)
	*/
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder buffer = new StringBuilder();
        
        s = s.trim();
        for(int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            if(Character.isWhitespace(c)) {
                if(buffer.length() != 0) {
                    reversed.append(buffer.reverse().toString()).append(" ");
                    buffer = new StringBuilder();
                }
            } else buffer.append(c);
        }
        reversed.append(buffer.reverse().toString());
        
        return reversed.toString();
    }
}
