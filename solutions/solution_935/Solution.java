package solutions.solution_935;

import java.util.Arrays;

class Solution {
    public int knightDialer(int n) {
        int MODULO = (int)1e9 + 7;
        long[][] dp = new long[n][10];
        Arrays.fill(dp[0], 1);

        if (n <= 1) {
            return 10 * n;
        }

        for (int i = 1; i < n; i++) {
            long[] prevRow = dp[i - 1];
            dp[i][0] = (prevRow[4] + prevRow[6]) % MODULO;
            dp[i][1] = (prevRow[6] + prevRow[8]) % MODULO;
            dp[i][2] = (prevRow[7] + prevRow[9]) % MODULO;
            dp[i][3] = (prevRow[4] + prevRow[8]) % MODULO;
            dp[i][4] = (prevRow[0] + prevRow[3] + prevRow[9]) % MODULO;
            dp[i][6] = (prevRow[0] + prevRow[1] + prevRow[7]) % MODULO;
            dp[i][7] = (prevRow[2] + prevRow[6]) % MODULO;
            dp[i][8] = (prevRow[1] + prevRow[3]) % MODULO;
            dp[i][9] = (prevRow[2] + prevRow[4]) % MODULO;
        }

        long result = (
            dp[n - 1][0] + dp[n - 1][1] + dp[n - 1][2]
            + dp[n - 1][3] + dp[n - 1][4] + dp[n - 1][6]
            + dp[n - 1][7] + dp[n - 1][8] + dp[n - 1][9]
        ) % MODULO;

        return (int)result;
    }
}
