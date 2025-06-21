class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        
        return common(text1, text2, 0, 0, dp);
    }

    private int common(String t1, String t2, int i, int j, int[][] dp) {
        if (i >= t1.length() || j >= t2.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (t1.charAt(i) == t2.charAt(j)) {
            dp[i][j] = 1 + common(t1, t2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(common(t1, t2, i + 1, j, dp), common(t1, t2, i, j + 1, dp));
        }

        return dp[i][j];
    }
}
