package solutions.solution_1155;

class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int MODULO = (int)1e9 + 7;
        if (n * k < target) {
            return 0;
        }

        int[][] dp = new int[n + 1][target + 1];
        dp[n][target] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int t = 0; t <= target; t++) {
                for (int j = 1; j <= k; j++) {
                    if (t - j >= 0) {
                        dp[i][t - j] = (dp[i][t - j] + dp[i + 1][t]) % MODULO;
                    }
                }
            }
        }

        return dp[0][0];
    }
}