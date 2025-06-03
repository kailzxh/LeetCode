class Solution {
    List<String> li = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n);
        return li;
    }

    private void backtrack(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            li.add(current);
            return;
        }

        if (open < max) {
            backtrack(current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(current + ")", open, close + 1, max);
        }
    }
}
