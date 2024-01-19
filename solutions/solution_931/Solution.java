package solutions.solution_931;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int[][] dp = new int[n][n];
        dp[0] = matrix[0];

        for (int i = 1; i < n; i++) {
            int[] currentRow = matrix[i];
            int[] prevRow = dp[i - 1];
            for (int j = 0; j < n; j++) {
                int minPrevResult = Integer.MAX_VALUE;
                for (int k = -1; k < 2; k++) {
                    int prevIndex = k + j;
                    if (prevIndex >= 0 && prevIndex < n) minPrevResult = Math.min(minPrevResult, prevRow[prevIndex]);
                }
                dp[i][j] = minPrevResult + currentRow[j];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int res: dp[n - 1]) {
            min = Math.min(min, res);
        }

        return min;
    }
}
