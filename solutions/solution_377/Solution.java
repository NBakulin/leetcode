package solutions.solution_377;

class Solution {
    int[] nums;
    int[] cachedResults;

    public int combinationSum4(int[] nums, int target) {
        this.cachedResults = new int[target + 1];
        for (int i = 0; i < target + 1; i++) {
            this.cachedResults[i] = -1;
        }
        this.nums = nums;

        return this.getCombinationsCount(target);
    }

    public int getCombinationsCount(int target) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        if (this.cachedResults[target] >= 0) {
            return this.cachedResults[target];
        }

        int result = 0;
        for (int i = 0; i < this.nums.length; i++) {
            result += this.getCombinationsCount(target - this.nums[i]);
        }

        this.cachedResults[target] = result;

        return result;
    }
}
