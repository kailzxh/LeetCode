class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;

        if (k == 0) {
            return n > 0 ? nums[0] : -1;
        }
        if (n == 1) {
            return (k % 2 == 0) ? nums[0] : -1;
        }
        if (k > n) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        int maxRemoved = Integer.MIN_VALUE;
        for (int i = 0; i < k - 1 && i < n; i++) {
            maxRemoved = Math.max(maxRemoved, nums[i]);
        }

        return (k < n) ? Math.max(maxRemoved, nums[k]) : maxRemoved;
    }
}
