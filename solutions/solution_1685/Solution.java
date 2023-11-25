package solutions.solution_1685;

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[0] += nums[i] - nums[0];
        }

        for (int i = 1; i < n; i++) {
            int diff = nums[i] - nums[i - 1];
            result[i] = result[i - 1] + diff * i - diff * (n - i);
        }

        return result;
    }
}
