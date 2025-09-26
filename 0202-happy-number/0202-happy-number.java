class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);               
            fast = sumOfSquares(sumOfSquares(fast)); 

            if (fast == 1) return true; 
        } while (slow != fast);

        return slow == 1; 
    }

    private int sumOfSquares(int n) {
        int total = 0;
        while (n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }

}