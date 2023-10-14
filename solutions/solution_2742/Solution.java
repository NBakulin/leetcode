package solutions.solution_2742;

import java.util.Arrays;

class Solution {
    int[] time;
    int[] cost;
    int n;
    int[][] dp;
    public int paintWalls(int[] cost, int[] time) {
        this.cost = cost;
        this.time = time;
        this.n = cost.length;
        this.dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(this.dp[i], -1);
        }

        return this.getMinCost(0, n - 1, 0);
    }

    public int getMinCost(int currentCost, int paintedWalls, int index) {
        if (paintedWalls < 0) return currentCost;
        if (index >= n) return Integer.MAX_VALUE;
//        if (this.dp[index][paintedWalls] > 0) return this.dp[index][paintedWalls];

        int result;
        result = this.getMinCost(
                currentCost + this.cost[index],
                paintedWalls - (this.time[index] + 1),
                index + 1
        );

        result = Math.min(this.getMinCost(
                currentCost,
                paintedWalls,
                index + 1
        ), result);

//        this.dp[index][paintedWalls] = result;

        return result;
    }
}