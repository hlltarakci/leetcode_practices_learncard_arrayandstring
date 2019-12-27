// https://leetcode.com/problems/array-partition-i/
class Solution {
	/*
		clarifying questions & edge cases:
		test: 
		
		algorithm:
            problem reduces to sorting the array and since it gets mins of each partition,
            pick nums at 0, 2, 4... and sum them up
		
        a: number of numbers
		time complexity: O(a log a) -- sorting array and iterating through by taking 2 steps each
		space complexity: O(1)
	*/
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+= 2) sum += nums[i];
        return sum;
    }
}
