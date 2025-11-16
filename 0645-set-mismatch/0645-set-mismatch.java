class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int dup = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            int freq = map.getOrDefault(i, 0);

            if (freq == 2) {
                dup = i;
            } else if (freq == 0) {
                missing = i;
            }
        }

        return new int[]{dup, missing};
    }
}
