import java.math.BigInteger;

class Solution {
    public int uniquePaths(int m, int n) {
        return combination(m + n - 2, m - 1);
    }

    private int combination(int total, int choose) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= choose; i++) {
            res = res.multiply(BigInteger.valueOf(total - i + 1));
            res = res.divide(BigInteger.valueOf(i));
        }
        return res.intValue();
    }
}
