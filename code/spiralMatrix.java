// https://leetcode.com/problems/spiral-matrix/
// https://www.youtube.com/watch?v=3joo9yAZVh8
class Solution {
	/*
		clarifying questions & edge cases:
            empty matrix case
		test: 
            [
             [ 1, 2, 3 ],
             [ 4, 5, 6 ],
             [ 7, 8, 9 ]
            ]
		algorithm:
            keep track of boundaries of outer rectangle and
            narrow it inwards after each step
		
        m: num of rows
        n: num of columns
		time complexity: O(m*n)
		space complexity: O(1)
	*/
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return result;
        
        int rowCount = matrix.length, colCount = matrix[0].length;
        
        // boundaries
        int rStart = 0, rEnd = rowCount-1, cStart = 0, cEnd = colCount-1;
        
        while(rStart <= rEnd && cStart <= cEnd) {
            // go left
            for(int i=cStart; i <= cEnd; i++) result.add(matrix[rStart][i]);
            rStart++;
            
            // go down
            for(int i=rStart; i <= rEnd; i++) result.add(matrix[i][cEnd]);
            cEnd--;
            
            // go right
            if(rStart <= rEnd) {
                for(int i=cEnd; i >= cStart; i--) result.add(matrix[rEnd][i]);
                rEnd--;
            }
            
            // go up
            if(cStart <= cEnd) {
                for(int i=rEnd; i >= rStart; i--) result.add(matrix[i][cStart]);
                cStart++;
            }
        }
        
        return result;
    }
}
