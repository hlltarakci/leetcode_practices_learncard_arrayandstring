// https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/

class Solution {
    /*
        time: O(n^2)
        space: O(n^2)
    */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        
        for(int i=0; i<numRows; i++) {
            List<Integer> result = new ArrayList<>();
            result.add(1);
            
            List<Integer> prevResult = results.size() > 0 ? results.get(results.size()-1) : new ArrayList<>();
            for(int j = 1; j < prevResult.size(); j++) {
                result.add(prevResult.get(j-1) + prevResult.get(j));
            }
            
            if(i > 0) result.add(1);
            results.add(result);
        }
        
        return results;
    }
}
