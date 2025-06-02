class Solution {
    
    private long nCr2(long n) {
        if (n < 2) return 0;
        return n * (n - 1) / 2;
    }

    
    private long nCr(long n, int k) {
        if (k == 2) return nCr2(n);
        return 0;
    }

    public long distributeCandies(int n, int limit) {
        long ways = 0;
        for (int j = 0; j <= 3; j++) {
            long sign = (j % 2 == 0) ? 1 : -1;
            long comb = binomial(3, j);
            long val = nCr(n - j * (limit + 1) + 2, 2);
            ways += sign * comb * val;
        }
        return Math.max(ways, 0);
    }

   
    private long binomial(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        if (r == 1) return n;
        if (r == 2) return (long) n * (n - 1) / 2;
        if (r == 3) return (long) n * (n - 1) * (n - 2) / 6;
        return 0; 
    }
}
