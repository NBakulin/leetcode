package solutions.solution_661;

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int i1 = -1; i1 <= 1; i1++) {
                    for (int i2 = -1; i2 <= 1; i2++) {
                        if (i + i1 >= 0 && i + i1 < m && j + i2 >= 0 && j + i2 < n) {
                            count++;
                            sum += img[i + i1][j + i2];
                        }
                    }
                }
                result[i][j] = sum / count;
            }
        }

        return result;
    }
}
