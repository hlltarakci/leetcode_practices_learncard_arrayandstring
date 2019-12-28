// https://leetcode.com/problems/rotate-array/solution/
class Solution {
	/*
		clarifying questions & edge cases:
            k greater than array length
		test: 
            [1,2,3,4,5,6,7] and k = 3
            7 6 5 4 3 2 1
            5 6 7 1 2 3 4
		
		algorithm:
            reverse array
            reverse first k elements
            reverse the rest
		
        n: array length
		time complexity: O(n)
		space complexity: O(1)
	*/
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
