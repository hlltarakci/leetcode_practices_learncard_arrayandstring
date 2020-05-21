// https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1173/
class Solution {
    /*
        n: array length
        time: O(n)
        space: O(1)
    */
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1; i<nums.length; i++) {
            if( nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        
        return index+1;
    }
}
