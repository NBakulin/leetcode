package solutions.solution_1269;

class Solution {
    public int numWays(int steps, int arrLen) {
        arrLen = Math.min(arrLen, steps / 2 + 1);
        int[][] dp = new int[steps + 1][arrLen];
        dp[0][0] = 1;

        if (steps < 2 || arrLen < 2) return dp[0][0];

        int MODULO = (int)1e9 + 7;

        for (int remainingSteps = 1; remainingSteps <= steps; remainingSteps++) {
            for (int index = 0; index < arrLen; index++) {
                int ways = dp[remainingSteps - 1][index];

                if (index > 0) {
                    ways = (ways + dp[remainingSteps - 1][index - 1]) % MODULO;
                }

                if (index < arrLen - 1) {
                    ways = (ways + dp[remainingSteps - 1][index + 1]) % MODULO;
                }

                dp[remainingSteps][index] = ways;
            }

        }

        return dp[steps][0];
    }
}
