package solutions.solution_70;

class Solution {
    public int climbStairs(int n) {
        int firstDp = 0;
        int secondDp = 1;
        int dpHolder;

        for (int i = 0; i < n; i++) {
            dpHolder = secondDp;
            secondDp += firstDp;
            firstDp = dpHolder;
        }

        return secondDp;
    }
}
