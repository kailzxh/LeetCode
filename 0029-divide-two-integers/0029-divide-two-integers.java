class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: Handle overflow when dividend is Integer.MIN_VALUE and divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Clamp to 2^31 - 1
        }

        // Determine the sign of the quotient
        boolean negative = (dividend < 0) ^ (divisor < 0); // XOR to check if only one is negative

        // Work with absolute values
        long absDividend = Math.abs((long) dividend); // Use long to prevent overflow
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;

        // Bitwise approach to subtraction
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;
            while (absDividend >= (temp << 1)) { // Double the divisor until it surpasses dividend
                temp <<= 1;
                multiple <<= 1;
            }
            absDividend -= temp;
            quotient += multiple;
        }

        // Apply sign
        return negative ? -quotient : quotient;
    }
}
