package solutions.solution_1425;

class Solution {
    int[] nums;
    int maxSingleValue = (int)-1e6 - 1;
    int maxValue = (int)-1e9 - 1;
    int[] dp;
    public int constrainedSubsetSum(int[] nums, int k) {
        this.nums = nums;
        this.dp = new int[nums.length];
        getMaxSum(0, k);

        if (this.maxValue == 0) return this.maxSingleValue;

        return Math.max(this.maxValue, this.maxSingleValue);
    }

    public int getMaxSum(int currentIndex, int k) {
        if (currentIndex > this.nums.length - 1) {
            return 0;
        }

        int currentValue = this.nums[currentIndex];
        this.maxSingleValue = Math.max(this.maxSingleValue, currentValue);
        if (currentIndex == this.nums.length - 1) {
            this.dp[currentIndex] = currentValue;
            return currentValue;
        }


        int cachedValue = this.dp[currentIndex];
        if (cachedValue != 0) return Math.max(cachedValue, 0);

        int newMaxValue = Integer.MIN_VALUE;
        int maxValueIndex = currentIndex + 1;
        for (int i = currentIndex + 1; i <= currentIndex + k && i < this.nums.length; i++) {
            int newValue = this.nums[i];
            if (newValue >= newMaxValue) {
                newMaxValue = newValue;
                maxValueIndex = i;
            }
            if (newMaxValue > 0) break;
        }

        int result = 0;
        if (newMaxValue >= 0) {
            result = Math.max(this.getMaxSum(maxValueIndex, k), result);
        } else {
            for (int i = maxValueIndex; i <= currentIndex + k; i++) {
                result = Math.max(getMaxSum(i, k), result);
            }
        }

        result += currentValue;
        maxValue = Math.max(maxValue, result);
        this.dp[currentIndex] = result;

        return result;
    }
}
