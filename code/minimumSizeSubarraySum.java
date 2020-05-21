// https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1299/
class Solution {
    /*
        n: arr len
        time: O(n)
        space: O(1)
    */
    public int minSubArrayLen(int s, int[] nums) {
        int min=Integer.MAX_VALUE, count=0, sumSoFar = 0;
        int left=0, right=0;
        
        while(right < nums.length) {
            if(sumSoFar < s) {
                count++;
                sumSoFar += nums[right++];
            } 
            
            while(sumSoFar >= s) {
                min = Math.min(min, count);
                count--;
                sumSoFar -= nums[left++];
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
