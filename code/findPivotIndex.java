// https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
class Solution {
    /*
        n: arr len
        time: O(n)
        space: O(1)
    */
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num: nums) sum += num;
        
        int sumSoFar = 0;
        for(int i=0; i<nums.length; i++) {
            if(sumSoFar == sum-nums[i]-sumSoFar) return i;
            sumSoFar += nums[i];
        }
        
        return -1;
    }
}
