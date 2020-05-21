// https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1151/

class Solution {
    /*
        n: array length
        time: O(n)
        space: O(1)
    */
    public int removeElement(int[] nums, int val) {
        int realIndex = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                if(i != realIndex) nums[realIndex] = nums[i];
                realIndex++;
            }
        }
        
        return realIndex;
    }
}
