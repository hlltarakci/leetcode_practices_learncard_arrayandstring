// https://leetcode.com/problems/plus-one/
class Solution {
	/*
		clarifying questions & edge cases:
            no leading 0s
            9999... case -- return 10000...
                for all other cases -- output will have the same size
		test: [4,3,2,1]

		algorithm: handle special (all 9) case separately 
            iterate backwards and add 1, pay attention to carry
        
        n: length of array
		time complexity: O(n)
		space complexity: O(1)
	*/
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] result = new int[len];
        int carry = 1, base = 10;
        for(int i=len-1; i>=0; i--) {
            result[i] = ( digits[i] + carry ) % base;
            carry = ( digits[i] + carry ) / base;
        }
        
        // all 9 case
        if( carry == 1 ) {
            result = new int[len+1];
            result[0] = 1;
        }
        
        return result;
    }
}
