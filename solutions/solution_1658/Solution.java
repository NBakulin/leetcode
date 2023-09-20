package solutions.solution_1658;

class Solution {

    public int minOperations(int[] nums, int x) {
        int i = 0;
        int j = nums.length - 1;
        int result = 0;

        while (i <= j) {
            x -= nums[i] <= nums[j] ? nums[i++] : nums[j--];
            result++;
            if (x <= 0) {
                break;
            }
        }

        if (x == 0) {
            return result;
        }

        return -1;
    }
}