package solutions.solution_1877;

import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int n = nums.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            result = Math.max(result, nums[i] + nums[n - i]);
        }

        return result;
    }
}