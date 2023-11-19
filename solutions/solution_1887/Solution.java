package solutions.solution_1887;

import java.util.Arrays;

class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int result = 0;

        int currentNumber = nums[n - 1];
        for (int i = n - 2; i >= 0 ; i--) {
            if (nums[i] != currentNumber) {
                result += count;
                currentNumber = nums[i];
            }
            count++;
        }

        return result;
    }
}
