// https://leetcode.com/problems/add-binary/
class Solution {
	/*
		clarifying questions & edge cases:
		test: a = "1010", b = "1011"
		
		algorithm: use strbuilder to reduce concat cost
            iterate from backwards
		
        a: length of a
        b: length of b
		time complexity: O(max(a,b))
		space complexity: O(1) -- excluding output
            output will take O(max(a,b)) space
	*/
    public String addBinary(String a, String b) {
        StringBuilder strBuilder = new StringBuilder();
        
        int indexA = a.length()-1, indexB = b.length()-1;
        int carry = 0, base = 2;
        
        while(indexA >= 0 || indexB >= 0) {
            int valA = indexA >= 0 ? Character.getNumericValue(a.charAt(indexA--)) : 0;
            int valB = indexB >= 0 ? Character.getNumericValue(b.charAt(indexB--)) : 0;
            int val = valA + valB + carry;
            strBuilder.append(val % base);
            carry = val / base;
        }
        
        if(carry > 0) strBuilder.append(carry);
        
        return strBuilder.reverse().toString();
    }
}
