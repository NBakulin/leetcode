package solutions.solution_746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev1 = 0, prev2 = 0;
        int index = 2;

        while (index <= n) {
            int newCost = Math.min(prev1 + cost[index - 1], prev2 + cost[index - 2]);
            prev2 = prev1;
            prev1 = newCost;
            index++;
        }

        return prev1;
    }
}
