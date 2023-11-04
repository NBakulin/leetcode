package solutions.solution_1503;

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int min = n + 1;
        for (int k : right) {
            if (k < min) {
                min = k;
            }
        }

        int max = 0;
        for (int j : left) {
            if (j > max) {
                max = j;
            }
        }

        return Math.max((n - min), max);
    }
}
