// https://leetcode.com/problems/move-zeroes/
class Solution {
	/*
		clarifying questions & edge cases:
            all nonzero case
		test: [0,1,0,3,12]
		
		algorithm:
            two pointers: one iterate forward one step each
                other at addition point of modifed array
		
        n: array length
		time complexity: O(n)
		space complexity: O(1)
	*/
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != 0) nums[index++] = nums[i];
        }
        
        for(int i=index; i<nums.length; i++) nums[i] = 0;
        
    }
}
