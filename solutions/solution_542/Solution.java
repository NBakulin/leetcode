package solutions.solution_542;

class Solution {
    int[][] mat, res;
    int m, n;

    public int[][] updateMatrix(int[][] mat) {
        this.m = mat.length;
        this.n = mat[0].length;

        this.mat = mat;
        this.res = new int[this.m][this.n];

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.res[i][j] = this.m + this.n;
            }
        }

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                if (this.mat[i][j] == 0) {
                    this.res[i][j] = 0;
                } else {
                    this.findMinNeighbour(i ,j);
                }
            }
        }

        for (int i = this.m - 1; i >= 0; i--) {
            for (int j = this.n - 1; j >= 0; j--) {
                if (this.mat[i][j] == 0) {
                    this.res[i][j] = 0;
                } else {
                    this.findMinNeighbour(i ,j);
                }
            }
        }

        return this.res;
    }

    public void findMinNeighbour(int i, int j)
    {
        int minVal = this.m + this.n;
        if (i > 0) {
            minVal = Math.min(this.res[i-1][j] + 1, minVal);
        }
        if (i < this.m - 1) {
            minVal = Math.min(this.res[i+1][j] + 1, minVal);
        }
        if (j > 0) {
            minVal = Math.min(this.res[i][j-1] + 1, minVal);
        }
        if (j < this.n - 1) {
            minVal = Math.min(this.res[i][j+1] + 1, minVal);
        }

        this.res[i][j] = minVal;
    }
}

