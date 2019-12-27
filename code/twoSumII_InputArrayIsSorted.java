// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Solution {
	/*
		clarifying questions & edge cases:
            pay attention to not return same index twice
            pay attention to return index array in order
		test: 
		    numbers = [2,7,11,15], target = 9
		algorithm:
            iterate through:
                each element is candidate -- look for (target - current) using binary search
		
        n: array length
		time complexity: O(n^2 log n)  
		space complexity: O(1)
	*/
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++) {
            int matchingPair = Arrays.binarySearch(numbers, target - numbers[i]);
            if(matchingPair >= 0 && matchingPair != i) {
                int[] pair = new int[] {i+1, matchingPair+1};
                Arrays.sort(pair);
                return pair;
            }
        }
        
        return new int[2];
    }
}
