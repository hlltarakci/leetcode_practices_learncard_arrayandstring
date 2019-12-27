// https://leetcode.com/problems/longest-common-prefix/
class Solution {
	/*
		clarifying questions & edge cases:
            empty word list -- return ""
		test: ["flower","flow","flight"]
		
		algorithm:
            take shortest word as the longest common prefix
            start iterating through word list
                while doing that decrement longest common prefix
		
        s: number of words in list
        w: length of shortest word
		time complexity: O(s*w)
		space complexity: O(1) 
	*/
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = getShortestWord(strs);
        int prefixIndex = prefix.length()-1;
        
        for(String str: strs) {
            for(int i=0; i <= prefixIndex; i++) {
                if(str.charAt(i) != prefix.charAt(i)) {
                    prefixIndex = i-1;
                    break;
                }
            }
            
            if(prefixIndex < 0) break;
        }
        
        return prefix.substring(0, prefixIndex+1);
    }
    
    // takes O(n) time
    private String getShortestWord(String[] strs) {
        int index = -1;
        
        for(int i=0; i < strs.length; i++) {
            if(index >= 0 && strs[index].length() < strs[i].length()) continue;
            index = i;
        }
    
        return strs[index];
    }
}
