// https://leetcode.com/problems/minimum-size-subarray-sum/
class Solution {
	/*
		clarifying questions & edge cases:
		test: 
            s = 7, nums = [2,3,1,2,4,3]
		
		algorithm:
            sliding windows
                iterate through 
                    while less than s, widen window,
                    shorten window until less then s

        n: array length
		time complexity: O(n)
		space complexity: O(1)
	*/
    public int minSubArrayLen(int s, int[] nums) {
        int minLen = Integer.MAX_VALUE, windowLen = 0, windowSum = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(windowSum <= s) {
                windowSum += nums[i];
                windowLen++;
            } 
            
            while(windowSum >= s) {
                minLen = Math.min(minLen, windowLen);
                
                windowSum -= nums[i-windowLen+1];
                windowLen--;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
