// https://leetcode.com/problems/pascals-triangle/
class Solution {
	/*
		clarifying questions & edge cases:
		test: 
		    5
		algorithm:
		    populate each row based on (looping through) previous entry
            
        n: num of rows
		time complexity: O(n^2)
		space complexity: O(1) -- excluding output
            output takes O(n^2) space
	*/
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for(int i=0; i<numRows; i++) {
            List<Integer> entry = new ArrayList<>();
            entry.add(1);
            
            if(i == 0) {
                triangle.add(entry);
                continue;
            }
            
            List<Integer> prevEntry = triangle.get(i-1);
            for(int j=1; j < prevEntry.size(); j++) {
                entry.add(prevEntry.get(j-1) + prevEntry.get(j));
            }
            
            entry.add(1);
            triangle.add(entry);
        }
        
        return triangle;
    }
}
