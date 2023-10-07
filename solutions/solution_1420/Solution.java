package solutions.solution_1420;

import java.util.Arrays;

class Solution {

    public int numOfArrays(int n, int m, int k) {
        if (k >= n || k > m) {
            return 0;
        }

        final int MODULO = (int)1e9 + 7;
        int[][][] dp = new int[n + 1][m + 1][k + 1];
        for (int i = 1; i <= m; i++) {
            Arrays.fill(dp[1][i], 1);
        }


        for (int index = 1; index <= n; index++) {
            for (int max = 1; max <= m; max++) {
                for (int cost = 1; cost <= k; cost++) {
                    for (int newValue = 1; newValue <= m; newValue++) {
                        if (newValue <= max) {
                            dp[index][newValue][cost] += dp[index - 1][max][cost];
                        } else if (cost < k) {
                            dp[index][newValue][cost + 1] += dp[index - 1][max][cost];
                        }
                    }
                }
            }
        }

        long result = 0;
        for (int max = 1; max <= m; max++) {
            result += dp[n][max][k];
            result %= MODULO;
        }

        return (int)result;
    }
}
