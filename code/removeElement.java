// https://leetcode.com/problems/remove-element/
class Solution {
	/*
		clarifying questions & edge cases:
            all elements equal to val -- return empty list
		test: 
		    nums = [0,1,2,2,3,0,4,2], val = 2
		algorithm:
            put pointers at both ends
            move forward
            if at val, check end pointer
            if end pointer val, decrement it until it is not, then get end pointer value to start pointer 
                and decrement end pointer
		
        n: nums length
		time complexity: O(n)
		space complexity: O(1)
	*/
    public int removeElement(int[] nums, int val) {
        int start = 0, end = nums.length-1;
        
        while(start <= end) {
            if(nums[start] != val) {
                start++;
                continue;
            }
            
            while(start <= end && nums[end] == val) end--;
            
            if(start < end) nums[start++] = nums[end--];
        }
        
        return  start;
    }
}
