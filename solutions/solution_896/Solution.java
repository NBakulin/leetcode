package solutions.solution_896;

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) {
            return true;
        }

        int isAscending = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            }

            if (nums[i - 1] < nums[i]) {
                if (isAscending == -1) {
                    isAscending = 1;
                } else if (isAscending == 0) {
                    return false;
                }
            } else {
                if (isAscending == -1) {
                    isAscending = 0;
                } else if (isAscending == 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
