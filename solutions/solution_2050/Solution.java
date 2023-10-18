package solutions.solution_2050;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> graph;
    int[] dp;

    public int minimumTime(int n, int[][] relations, int[] time) {
        this.dp = new int[n];

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < relations.length; i++) {
            int[] relation = relations[i];
            graph.get(relation[1] - 1).add(relation[0] - 1);
        }

        int result = 0;
        for (int i = 0; i < n; i++) result = Math.max(result, getMaxCourse(i, time));

        return result;
    }

    public int getMaxCourse(int startingPoint, int[] time) {
        List<Integer> entryPoints = graph.get(startingPoint);

        if (this.dp[startingPoint] > 0) return this.dp[startingPoint];

        if (entryPoints.isEmpty()) return time[startingPoint];

        int result = 0;
        for (int entry: entryPoints) result = Math.max(result, getMaxCourse(entry, time));

        result += time[startingPoint];
        this.dp[startingPoint] = result;

        return result;
    }
}
