class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(minCost(cost, 0, memo), minCost(cost, 1, memo));
    }

    private int minCost(int[] cost, int i, int[] memo) {
        if (i >= cost.length) return 0;
        if (memo[i] != -1) return memo[i];

        int oneStep = minCost(cost, i + 1, memo);
        int twoStep = minCost(cost, i + 2, memo);
        memo[i] = cost[i] + Math.min(oneStep, twoStep);
        return memo[i];
    }
}
