package solutions.solution_198;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i] += nums[i];
            if (i > 1) {
                int maxRobbed = dp[i - 2];
                if (i > 2) {
                    maxRobbed = Math.max(maxRobbed, dp[i - 3]);
                }
                dp[i] += maxRobbed;
            }
        }

        return Math.max(dp[n - 2], dp[n - 1]);
    }
}