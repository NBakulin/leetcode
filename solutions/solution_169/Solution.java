package solutions.solution_169;

class Solution {
    public int majorityElement(int[] nums) {
        int streak = 0;
        int currentNum = nums[0];

        for (int num: nums) {
            if (currentNum == num) {
                streak++;
            } else {
                streak--;
            }

            if (streak == 0) {
                streak = 1;
                currentNum = num;
            }
        }

        return currentNum;
    }
}
