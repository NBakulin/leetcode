package solutions.solution_799;

class Solution {
    double poured = 0;
    int targetGlassRow;
    int targetGlassIndex;

    double[][] glassesMap;
    public double champagneTower(int poured, int targetGlassRow, int targetGlassIndex) {
        if (poured == 0) {
            return 0;
        }

        if (targetGlassRow == 0) {
            return Math.min(poured, 1);
        }

        this.glassesMap = new double[targetGlassRow + 1][targetGlassRow + 1];
        for (int i = 0; i <= targetGlassRow; i++) {
            for (int j = 0; j <= targetGlassRow; j++) {
                this.glassesMap[i][j] = -1;
            }
        }

        this.poured = poured;
        this.targetGlassRow = targetGlassRow;
        this.targetGlassIndex = targetGlassIndex;

        double result = this.getPouredVolume(targetGlassRow, targetGlassIndex);

        return Math.min(result, 1);
    }

    public double getPouredVolume(int row, int glassIndex) {
        double result = 0;

        if (row == 0) {
            result = (this.poured - 1) / 2;

            return result;
        }

        if (glassIndex > row || glassIndex < 0) {
            return 0;
        }

        for (int i = 0; i < 2; i++) {
            if (glassIndex >= 1 && this.glassesMap[row - 1][glassIndex - i] >= 0) {
                result += this.glassesMap[row - 1][glassIndex - i];
            } else {
                result += this.getPouredVolume(row - 1, glassIndex - i);
            }
        }

        if (row == this.targetGlassRow) {
            return result / 2;
        }

        result = result / 2 - 1;
        if (result < 0) {
            result = 0;
        }

        this.glassesMap[row][glassIndex] = result;

        return result;
    }
}

