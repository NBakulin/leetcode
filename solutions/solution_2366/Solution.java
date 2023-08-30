package solutions.solution_2366;

class Solution {
    public long minimumReplacement(int[] nums) {
        long operationsCount = 0;

        if (nums.length < 2) {
            return 0;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] >= nums[i]) {
                continue;
            }

            if (nums[i] % nums[i + 1] == 0) {
                operationsCount += nums[i] / nums[i + 1] - 1;
                nums[i] = nums[i + 1];
                continue;
            }

            int elementsCount = nums[i] / nums[i + 1] + 1;
            operationsCount += elementsCount - 1;
            nums[i] = nums[i] / elementsCount;
        }

        return operationsCount;
    }
}
