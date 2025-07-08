class Solution {
    public boolean isPalindrome(int x) {
        // Convert the number to a string
        String str = String.valueOf(x);
        
        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        return str.equals(reversedStr);
    }
}
