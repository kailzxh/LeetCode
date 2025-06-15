class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> combi, int k, int n, int start) {
        if (combi.size() == k && n == 0) {
            result.add(new ArrayList<>(combi));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) break; 

            combi.add(i);
            backtrack(result, combi, k, n - i, i + 1);
            combi.remove(combi.size() - 1); 
        }
    }
}
