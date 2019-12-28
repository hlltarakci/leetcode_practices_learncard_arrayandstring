// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
	/*
		clarifying questions & edge cases:
            empty array
		test: 
		
		algorithm:
		    iterate through keeping two pointers:
                one is always one step forward
                second is at adition point of modified array
        
        n: array length
		time complexity: O(n)
		space complexity: O(1)
	*/
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int index = 1;
        
        for(int i=1; i < nums.length; i++) {
            if(nums[i] == nums[index-1]) continue;
            nums[index++] = nums[i];
        }
            
        return index;
    }
}
