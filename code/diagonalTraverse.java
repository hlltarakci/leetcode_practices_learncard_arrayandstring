// https://leetcode.com/problems/diagonal-traverse/
class Solution {
	/*
		clarifying questions & edge cases:
		test: 
		
		algorithm:
		
		time complexity: 
		space complexity:
	*/
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return new int[0];
        
        int rowCount = matrix.length, colCount = matrix[0].length;
        int[] result = new int[rowCount*colCount];
        
        int index = 0;
        boolean isUp = true;
        for(int r=0; r < rowCount; r++) {
            index = process(matrix, result, index, r, 0, isUp);
            isUp = !isUp;
        }
        
        for(int c=1; c < colCount; c++) {
            index = process(matrix, result, index, rowCount-1, c, isUp);
            isUp = !isUp;
        }
        
        return result;
    }
    
    private int process(int[][] matrix, int[] result, int index, int row, int col, boolean isUp) {
        if(isUp) {
            while(row >= 0 && col < matrix[0].length) {
                result[index++] = matrix[row--][col++];
            }
        } else {
            index += Math.min(row, matrix[0].length - col - 1);
            int tempIndex = index;
            while(row >= 0 && col < matrix[0].length) {
                result[tempIndex--] = matrix[row--][col++];
            }
            index++;
        }
        
        return index;
    }
}
