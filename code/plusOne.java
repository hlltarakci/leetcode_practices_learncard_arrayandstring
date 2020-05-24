// https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/

class Solution {
    /*
        n: arr len
        time: O(n)
        space: O(1) -- reused input space
    */
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--) {
            int val = digits[i] + carry;
            carry = val / 10;
            digits[i] = val % 10;
            
            if(carry == 0) return digits;
        }
        
        if(carry == 1) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        
        return digits;
    }
}
