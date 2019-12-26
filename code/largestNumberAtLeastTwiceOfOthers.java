// https://leetcode.com/problems/largest-number-at-least-twice-of-others/
class Solution {
    /*
        clarifying questions & edge cases:
            only non-neg numbers given
            non-empty array is not given
            when there is only one element, it is dominant
        test: [3, 6, 1, 0]

        algorithm:
            approach #1: two passes: 
                find max element in first pass, check if it is twice as big in second pass
            approach #2: one pass:
                keep track of two max elements and 
                check if bigger of two max elements is at least twice big as the lesser of max elements

        n: nums of elements in array
        time complexity: O(n)
        space complexity: O(1)
    */
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        
        int max1 = nums[0] > nums[1] ? 0 : 1;
        int max2 = nums[0] > nums[1] ? 1 : 0;
        
        for(int i=2; i < nums.length; i++) {
            max2 = nums[max2] > nums[i] ? max2 : i;
            if(nums[max1] < nums[max2]) {
                int temp = max2;
                max2 = max1;
                max1 = temp;
            }
        }
        
        return nums[max1] >= nums[max2] * 2 ? max1 : -1;
    }
}
