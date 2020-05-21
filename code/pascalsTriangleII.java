// https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1171/

class Solution {
    /*
        time: O(k^2)
        space: O(k)
    */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++) {
            result = new ArrayList<>();
            result.add(1);
            
            for(int j=0; j<prev.size()-1; j++) 
                result.add(prev.get(j) + prev.get(j+1));
            
            if(i > 0) result.add(1);
            prev = result;
        }
        
        return result;
    }
}
