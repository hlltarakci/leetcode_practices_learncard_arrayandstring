// https://leetcode.com/problems/reverse-string/
class Solution {
    /*
		clarifying questions & edge cases:
		test: 
		
		algorithm: two pointers at each end, swap chars
		
        n: length of array
		time complexity: O(n)
		space complexity: O(1)
	*/
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        
    }
}
