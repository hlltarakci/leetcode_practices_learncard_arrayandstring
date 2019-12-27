// https://leetcode.com/problems/max-consecutive-ones/
class Solution {
	/*
		clarifying questions & edge cases:
		test: 
		    [1,1,0,1,1,1]
		algorithm:
            iterate through, keep track of consecutive 1 length
		
        n: array length
		time complexity: O(n)
		space complexity: O(1)
	*/
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        
        for(int num: nums) {
            if(num == 1) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        
        return max;
    }
}
