// https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1183/
class Solution {
    /*
        n: array len
        time: O(n)
        space: O(1)
    */
    public void reverseString(char[] s) {
        if(s == null) return;
        int left=0, right=s.length-1;
        while(left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
