//package solutions.solution_1335;

class Solution {
    int[] jd;
    int n;
    int d;
    public int minDifficulty(int[] jobDifficulty, int d) {
        this.n = jobDifficulty.length;
        this.jd = jobDifficulty;

        if (this.n < d) {
            return -1;
        }
        this.d = d;

        return this.getMinimalDifficulty(0 , 0, 0, 0);
    }

    public int getMinimalDifficulty(int currentSum, int divisionsCount, int currentMax, int currentIndex) {
        int result = Integer.MAX_VALUE;

        if (currentIndex == n || currentIndex == n - 1) {
            return currentSum + Math.min(currentMax, jd[n - 1]);
        }

        if (divisionsCount < d - 1) {
            result = getMinimalDifficulty(currentSum + currentMax, divisionsCount + 1, jd[currentIndex + 1], currentIndex + 1);
        }

        result = Math.min(getMinimalDifficulty(currentSum, divisionsCount,  Math.min(currentMax, jd[currentIndex]), currentIndex + 1), result);
System.out.println(result);
        return result;
    }
}
