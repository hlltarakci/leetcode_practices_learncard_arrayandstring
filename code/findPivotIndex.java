// https://leetcode.com/problems/find-pivot-index/
class Solution {
    /*
        clarifying questions & edge cases:
            both neg and pos numbers allowed
            while calculating sum, watch out for overflow and underflow
            watch for empty array case
            watch for case when answer is first or last element of array 
                (left side and right side sums equal to 0)
        test: [1, 7, 3, 6, 5, 6]
        
        algorithm: calculate total sum.
            for each entry, keep track of sum of previous elements
                and check if sum of remaining elements at right side
                equals to sum of previous elements.
                
                return such an element
        
        n: number of elements in array
        time complexity: O(n) --- two passes: sum calculation and second iteration
        space complexity: O(1) --- only needs two extra variables (sum and prev sum)
    */
    public int pivotIndex(int[] nums) {
        long sum = calcSum(nums);
        long leftSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            long rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum) return i;
            
            leftSum += nums[i];
        }
        
        return -1;
    }
    
    private long calcSum(int[] nums) {
        long sum = 0;
        
        for(int num: nums) sum += num;
        
        return sum;
    }
}
