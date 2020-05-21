// https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1174/
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


///////////slightly different approach/////////////////
class Solution {
    /*
        n: array length
        time: O(n)
        space: O(1)
    */
    public void moveZeroes(int[] nums) {
        if(nums == null) return;
        
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) 
                continue;
            
            nums[index] = nums[i];
            if(i != index) nums[i] = 0;
            index++;
        }
    }
}
