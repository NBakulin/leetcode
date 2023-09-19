package solutions.solution_287;

class Solution {
    public int findDuplicate(int[] nums) {
        int currentIndex = nums[0];
        int counter = 0;

        while (counter < nums.length) {
            currentIndex = nums[currentIndex];
            counter++;
        }

        return nums[currentIndex];
    }
}
