package solutions.soluttion_2482;

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowsCounts = new int[m];
        int[] columnsCounts = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowsCounts[i]++;
                    columnsCounts[j]++;
                }
            }
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (rowsCounts[i] + columnsCounts[j]) * 2 - m - n;
            }
        }

        return result;
    }
}
