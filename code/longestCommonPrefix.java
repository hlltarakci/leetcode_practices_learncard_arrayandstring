// https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1162/

class Solution {
    /*
        s: num of str array
        l: lenght of min str
        time: O(s l)
        space: O(l) -- output
    */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        int minLen = getShortestWordLen(strs);
        
        StringBuilder prefix = new StringBuilder();
        prefix.append("");
        for(int i=0; i<minLen; i++) {
            char ch = strs[0].charAt(i);
            for(String str: strs) {
                if(ch != str.charAt(i)) return prefix.toString();
            }
            prefix.append(ch);
        }
        
        return prefix.toString();
    }
    
    private int getShortestWordLen(String[] strs) {
        int min = strs[0].length();
        for(String str: strs) min = Math.min(min, str.length());
        return min;
    }
}
