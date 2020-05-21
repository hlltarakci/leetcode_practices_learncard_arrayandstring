// https://leetcode.com/problems/reverse-words-in-a-string-iii/
class Solution {
	/*
		clarifying questions & edge cases:
		test: 
		
		algorithm:
            iterate through string 
                when met a character - it is start of word
                when met a whitespace - it is end of word
                take reverse and put in string builder
		
        n: string length
		time complexity: O(n)
		space complexity: O(1) -- excluding output
            output uses O(n) space
	*/
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        
        int startOfWord = -1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isWhitespace(c)) {
                if(startOfWord == -1) reversed.append(c);
                else {
                    reverseAndAppend(reversed, s, startOfWord, i);
                    startOfWord = -1;
                    reversed.append(c);
                }
            } else {
                if(startOfWord == -1) startOfWord = i;
            }
        }
        
        if(startOfWord != -1 && !Character.isWhitespace(s.charAt(s.length()-1))) 
            reverseAndAppend(reversed, s, startOfWord, s.length());
        
        return reversed.toString();
    }
    
    private void reverseAndAppend(StringBuilder reversed, String s, int start, int end) {
        for(int k=end-1; k>= start; k--) reversed.append(s.charAt(k));
    }
}


//////////////////another approach//////////////////////
class Solution {
    /*
        s: str len
        time: O(s)
        space: O(s) -- output
    */
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        if(words.length == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        for(String word: words) {
            sb.append(reverse(word)).append(" ");
        }
        
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
    
    private String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) sb.append(str.charAt(i));
        return sb.toString();
    }
}
