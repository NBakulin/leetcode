package solutions.solution_905;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int tmp;

        while (i != j) {
            if (nums[i] % 2 == 0) {
                i++;
                continue;
            }
            if (nums[j] % 2 == 1) {
                j--;
                continue;
            }

            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        return nums;
    }
}
