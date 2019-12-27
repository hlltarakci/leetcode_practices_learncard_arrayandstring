// https://leetcode.com/problems/implement-strstr/
class Solution {
	/*
		clarifying questions & edge cases:
            shorter haystack then needle -- return -1
            empty needle -- return 0
		test: 
            haystack = "hello", needle = "ll"
		    haystack = "hello", needle = "lx"
		algorithm:
            iterate through haystack anh keep comparing with needle as long as they match
            once haystack and needle do not match, go back to one next character in string
		
        h: haystack length
        n: needle length
		time complexity: O(h*n) 
		space complexity: O(1)
	*/
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(needle.length() > haystack.length()) return -1;
        
        int nIndex = 0;
        for(int i=0; i<haystack.length(); i++) {
            char needleChar = needle.charAt(nIndex);
            char haystackChar = haystack.charAt(i);
            
            if(haystackChar == needleChar) nIndex++;
            else {
                i -= nIndex;
                nIndex = 0;
            }
            
            if(nIndex == needle.length()) return i-nIndex+1;
        }
        
        return -1;
    }
}
