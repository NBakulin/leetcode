package solutions.solution_1658;

class Solution {

    public int minOperations(int[] nums, int x) {
        int sum = -x;
        int n = nums.length;

        for (int num: nums) {
            sum+= num;
        }
        if (sum == 0) {
            return n;
        }
        if (sum < 0) {
            return -1;
        }

        sum = 0;
        int currentSum;
        int result = 0;
        int currentResult;
        int finalResult = -1;
        int leftIndex;
        int rightIndex = 0;


        for (int right: nums) {
            leftIndex = n - 1;
            currentSum = sum;
            currentResult = result;

            while (currentSum < x && rightIndex <= leftIndex) {
                currentSum += nums[leftIndex--];
                currentResult++;
            }

            if (currentSum == x) {
                if (finalResult == -1) {
                    finalResult = currentResult;
                } else {
                    finalResult = Math.min(finalResult, currentResult);
                }
            }

            result++;
            sum += right;
            rightIndex++;
        }

        return finalResult;
    }
}