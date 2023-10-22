//package solutions.solution_1793;

class Solution {
    public int maximumScore(int[] nums, int k) {
        int i = k;
        int j = k;
        int n = nums.length;
        int minValue = nums[k];
        int maxScore = minValue;

        while (true) {
            int iValue = 0;
            if (i > 0) iValue = nums[i - 1];

            int jValue = 0;
            if (j < n - 1) jValue = nums[j + 1];

            if (iValue == 0 && jValue == 0) break;

            if (iValue >= jValue) {
                i--;
                minValue = Math.min(iValue, minValue);
            } else {
                j++;
                minValue = Math.min(jValue, minValue);
            }
            maxScore = Math.max(maxScore, (j - i + 1) * minValue);
        }

        return maxScore;
    }
}
