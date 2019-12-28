// https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
	/*
		clarifying questions & edge cases:
            negative k
		test: 
		
		algorithm:
		    keep track only the last 2 rows
            
        k: row index
		time complexity: O(k^2)
		space complexity: O(k)
	*/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        if(rowIndex < 0) return row;
        
        row.add(1);
        
        while(rowIndex-- > 0) {
            List<Integer> next = new ArrayList<>();
            
            for(int i=0; i<row.size(); i++) {
                if(i == 0) next.add(1);
                else next.add(row.get(i-1) + row.get(i));
            }
            
            next.add(1);
            
            row = next;
        }
        
        return row;
    }
}
