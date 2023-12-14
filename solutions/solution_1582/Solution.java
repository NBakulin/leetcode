package solutions.solution_1582;

class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] countPerRow = new int[m];
        int[] countPerColumn = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    countPerRow[i]++;
                    countPerColumn[j]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            if (countPerRow[i] == 1) {
                for (int j = 0; j < n; j++) {
                    if (countPerColumn[j] == 1 && mat[i][j] == 1) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
